package test.fw.utils;

public class MyRunnableTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(10000); //何らかの処理
            System.out.println("スリープ終了");
        } catch (InterruptedException ex) {
        	ex.printStackTrace();
        }
    }
}
