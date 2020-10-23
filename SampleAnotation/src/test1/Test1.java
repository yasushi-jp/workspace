package test1;

public class Test1 {
	public static void main(String[] args) throws Exception {

		Class<?> c1 = Class.forName("test1.Sample1");
		TestAnnotation1 a1 = (TestAnnotation1) c1.getAnnotation(TestAnnotation1.class);

		if (a1 != null) {
			if (a1.version().equals("1.05")) {
				System.out.println("1.05です"); //1.05です
			}
			if (a1.author().equals("taro")) {
				System.out.println("taroです"); //taroです
			}
		} else {
			System.out.println("アノテーションはありません。");
		}
	}
}
