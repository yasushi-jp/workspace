package pattern1;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/**
 * JavaSE7のファイル監視の実験
 */
public class FileMonitoring1 implements Runnable {

	/**
	 * 監視先ディレクトリ
	 */
	private String dirName;

	/**
	 * イベントごとのウェイト時間(秒)
	 */
	private int waitCnt;

	/**
	 * オプションの修飾子
	 */
	private WatchEvent.Modifier[] extModifiers;

	/**
	 * 実行部
	 */
	@Override
	@SuppressWarnings({ "SleepWhileInLoop", "CallToThreadDumpStack" })
	public void run() {
		try {
			// ファイル監視などの機能は新しいNIO2クラスで拡張されたので
			// 旧File型から、新しいPath型に変換する.
			Path dirPath = new File(dirName).toPath();
			System.out.println(String.format("監視先: %s\n待機時間: %d\n", dirName, waitCnt));

			// ディレクトリが属するファイルシステムを得る
			FileSystem fs = dirPath.getFileSystem();

			// ファイルシステムに対応する監視サービスを構築する.
			// (一つのサービスで複数の監視が可能)
			try (WatchService watcher = fs.newWatchService()) {
				// ディレクトリに対して監視サービスを登録する.
				WatchKey watchKey = dirPath.register(watcher, new Kind[] {
						StandardWatchEventKinds.ENTRY_CREATE, // 作成
						StandardWatchEventKinds.ENTRY_MODIFY, // 変更
						StandardWatchEventKinds.ENTRY_DELETE, // 削除
						StandardWatchEventKinds.OVERFLOW }, // 特定不能時
						extModifiers); // オプションの修飾子、不要ならば空配列

				// 監視が有効であるかぎり、ループする.
				// (監視がcancelされるか、監視サービスが停止した場合はfalseとなる)
				while (watchKey.isValid()) {
					try {
						// スレッドの割り込み = 終了要求を判定する.
						if (Thread.currentThread().isInterrupted()) {
							throw new InterruptedException();
						}

						// ファイル変更イベントが発生するまで待機する.
						WatchKey detecedtWatchKey = watcher.poll(500, TimeUnit.MILLISECONDS);
						if (detecedtWatchKey == null) {
							// タイムアウト
							System.out.print(".");
							continue;
						}
						System.out.println();

						// イベント発生元を判定する
						if (detecedtWatchKey.equals(watchKey)) {
							// 発生したイベント内容をプリントする.
							for (WatchEvent<?> event : detecedtWatchKey.pollEvents()) {
								// 追加・変更・削除対象のファイルを取得する.
								// (ただし、overflow時などはnullとなることに注意)
								Path file = (Path) event.context();
								System.out.println(event.kind() +
										": count=" + event.count() +
										": path=" + file);
							}
						}

						// イベントのハンドリングに時間がかかるケースを
						// Sleepでエミュレートする.
						// (この間のファイル変更イベントを取りこぼすか否かを確かめられる)
						for (int cnt = 0; cnt < waitCnt; cnt++) {
							System.out.print(String.format("%d/%d...\r", cnt + 1, waitCnt));
							Thread.sleep(1000);
						}

						// イベントの受付を再開する.
						detecedtWatchKey.reset();

					} catch (InterruptedException ex) {
						// スレッドの割り込み = 終了要求なので監視をキャンセルしループを終了する.
						System.out.println("監視のキャンセル");
						watchKey.cancel();
					}
				}
			}
		} catch (RuntimeException | IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("スレッドの終了");
	}

	/**
	 * 第一引数に監視対象のディレクトリを指定する.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws Exception {
		// 監視先
		String dirName = "C:\\temp";
		// イベントごとのウェイト
		int waitCnt = 0;
		WatchEvent.Modifier[] extModifiers = new WatchEvent.Modifier[0];

		// オプションを解析する.
		int mx = args.length;
		for (int idx = 0; idx < mx; idx++) {
			String arg = args[idx];
			if (arg.startsWith("-w:")) {
				waitCnt = Integer.parseInt(arg.substring(3));
			} else if (arg.equals("-r")) {
				extModifiers = new WatchEvent.Modifier[] {
						// ファイルツリーを監視する非標準の修飾子
						// ※ Windows以外では正しく機能しない.
						com.sun.nio.file.ExtendedWatchEventModifier.FILE_TREE
				};
			} else {
				dirName = arg;
				break;
			}
		}

		// スレッドの開始
		FileMonitoring1 inst = new FileMonitoring1();
		inst.dirName = dirName;
		inst.waitCnt = waitCnt;
		inst.extModifiers = extModifiers;
		Thread thread = new Thread(inst);
		thread.start();

		// エンターキーが押されるまで実行(コンソールがある場合)
		Console cons = System.console();
		if (cons != null) {
			cons.printf("エンターキーで終了.\n");
			cons.readLine();

			// スレッドへの終了要求と終了待機
			thread.interrupt();
		}

		// スレッド終了まで待機
		thread.join();
		System.out.println("done.");
	}
}