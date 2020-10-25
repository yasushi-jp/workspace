package test1;

import java.lang.annotation.Annotation;

public class Test3 {
    public static void main(String[] args) throws Exception {

        Class<?> c1 = Class.forName("test1.Sample1");
        for (Annotation a : c1.getAnnotations()) {
            System.out.println(a);
            System.out.println(a.annotationType());
            System.out.println(a.getClass());
            System.out.println(c1.getClass());
        }
//		if (a1 != null) {
//			if (a1.version().equals("1.05")) {
//				System.out.println("1.05です"); //1.05です
//			}
//			if (a1.author().equals("taro")) {
//				System.out.println("taroです"); //taroです
//			}
//		} else {
//			System.out.println("アノテーションはありません。");
//		}
    }
}
