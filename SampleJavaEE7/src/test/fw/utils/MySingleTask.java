package test.fw.utils;

import java.util.concurrent.Callable;

public class MySingleTask implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		System.out.println("task executed!");
		return "success";
	}
}
