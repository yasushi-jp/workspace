package pattern2;

public class Main02 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("メイン処理を開始します！！");

		FileMonitoring2 watcher = new FileMonitoring2();

		watcher.setWatchPath("C:\\tmp\\");
		watcher.setWatchTextName("end.txt");

		Thread thread = new Thread(watcher);

		thread.start();

		thread.join();

		System.out.println("ent.txtができたので、メイン処理を再開します！");
	}

}
