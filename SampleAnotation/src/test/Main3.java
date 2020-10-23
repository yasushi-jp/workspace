package test;

import java.lang.annotation.Annotation;

public class Main3 {

	public static void main(String[] args) {

		Annotation snnotations[] = SampleAnnotation.class.getAnnotations();
		System.out.println("annotation size is [" + snnotations.length + "]");
		for (int i = 0; i < snnotations.length; i++) {
			Annotation annotation = snnotations[i];
			System.out.println("    annotation class is [" + annotation.annotationType().getName() + "]");
		}
	}

}
