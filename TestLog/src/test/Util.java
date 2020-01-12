package test;

public class Util {
	public static String getClassName() {
		return Thread.currentThread().getStackTrace()[2].getClassName();
	}
}
