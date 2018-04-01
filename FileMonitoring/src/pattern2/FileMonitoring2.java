package pattern2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileMonitoring2 implements Runnable {

	private String watchPath;
	private String watchTextName;

	public String getWatchPath() {
		return watchPath;
	}

	public void setWatchPath(String watchPath) {
		this.watchPath = watchPath;
	}

	public String getWatchTextName() {
		return watchTextName;
	}

	public void setWatchTextName(String watchTextName) {
		this.watchTextName = watchTextName;
	}

	@Override
	public void run() {
		Path dir = Paths.get(watchPath);

		WatchService watcher;
		try {
			watcher = FileSystems.getDefault().newWatchService();
			dir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE);

			while (true) {
				WatchKey watchKey = watcher.take();

				Path name = null;
				for (WatchEvent<?> event : watchKey.pollEvents()) {
					WatchEvent.Kind<?> kind = event.kind();

					//A special event to indicate that events may have been lost or discarded.
					if (kind == StandardWatchEventKinds.OVERFLOW) {
						continue;
					}

					name = (Path) event.context();
					Path child = dir.resolve(name);

					if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
						System.out.println(child + "が作成されました！");
						System.out.println("できたファイルの名前は・・・" + name.toString());

						if (name.toString().equals(watchTextName)) {
							System.out.println("ほしいテキストができたから、ループを抜けるよ・・・");

							//ここでforを抜ける
							break;
						}
						watchKey.reset();
					}
				}

				//forを抜けたら、今度はwhileを抜けないと。でもこの辺のコード重複しててなんか汚い
				if (name != null && name.toString().equals(watchTextName)) {
					break;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
