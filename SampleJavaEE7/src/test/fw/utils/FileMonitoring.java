package test.fw.utils;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FileMonitoring implements Callable<String> {

	/** 監視ディレクトリ */
	private String dirName;

	/** 監視ファイル名 */
	private String fileName;

	/**
	 * @return dirName
	 */
	public String getDirName() {
		return dirName;
	}

	/**
	 * @param dirName セットする dirName
	 */
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	/**
	 * @return fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName セットする fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String call() throws Exception {
		Path dirPath = Paths.get(dirName);
		// ディレクトリが属するファイルシステムを得る
		FileSystem fs = dirPath.getFileSystem();
		// ファイルシステムに対応する監視サービスを構築する
		// (一つのサービスで複数の監視が可能)
		try (WatchService watcher = fs.newWatchService()) {
			// ディレクトリに対して監視サービスを登録する
			WatchKey watchKey = dirPath.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);
			// 監視が有効であるかぎり、ループする
			// (監視がcancelされるか、監視サービスが停止した場合はfalseとなる)
			while (watchKey.isValid()) {
				try {
					// スレッドの割り込み = 終了要求を判定する
					if (Thread.currentThread().isInterrupted()) {
						throw new InterruptedException();
					}
					// ファイル作成イベントが発生するまで待機する
					WatchKey detecedtWatchKey = watcher.poll(5000, TimeUnit.MILLISECONDS);
					if (detecedtWatchKey == null) {
						// タイムアウト
						System.out.println("タイムアウト");
						return "timeout";
					}
					// イベント発生元を判定する
					if (detecedtWatchKey.equals(watchKey)) {
						// 発生したイベント内容をプリントする
						for (WatchEvent<?> event : detecedtWatchKey.pollEvents()) {
							// 追加・変更・削除対象のファイルを取得する
							// (ただし、overflow時などはnullとなることに注意)
							Path file = (Path) event.context();
							System.out.println(event.kind() + ": count=" + event.count() + ": path=" + file);
							if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
								if (file.toString().equals(fileName)) {
									watchKey.cancel();
									return file.toString();
								}
							}
						}
						// イベントの受付を再開する
						detecedtWatchKey.reset();
					}
				} catch (InterruptedException e) {
					// スレッドの割り込み = 終了要求なので監視をキャンセルしループを終了する
					System.out.println("監視のキャンセル");
					watchKey.cancel();
				}
			}
		} catch (RuntimeException | IOException e) {
			e.printStackTrace();
		}

		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
