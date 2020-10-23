package test1;

import java.lang.reflect.Method;

public class Test2 {
	public static void main(String[] args) throws Exception {

		Class<?> c1 = Class.forName("test1.Sample2");
		Method method = c1.getMethod("print", new Class[] {});

		TestAnnotation1 b1 =
		(TestAnnotation1) method.getAnnotation(TestAnnotation1.class);

		if(b1.version().equals("2.01")) {
			System.out.println("2.01です"); //2.01です
		}
		if(b1.author().equals("jiro")) {
			System.out.println("jiroです"); //jiroです
		}
	}
}
