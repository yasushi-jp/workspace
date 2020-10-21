package jp.co.test;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ClassFinder cf = new ClassFinder();
		List<Class<?>> classes = null;
		try {
			classes = cf.getClasses("jp.co.test");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		for (Class<?> clazz : classes) {
			System.out.println(clazz.getName());
		}
	}

}
