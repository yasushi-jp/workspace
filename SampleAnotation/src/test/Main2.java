package test;

import java.lang.annotation.Annotation;

public class Main2 {

	public static void main(String[] args) {

		class DataAnnotation2 implements SampleAnnotation {
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO 自動生成されたメソッド・スタブ
				return SampleAnnotation.class;
			}

			@Override
			public String id() {
				// TODO 自動生成されたメソッド・スタブ
				return "09";
			}

			@Override
			public String name() {
				// TODO 自動生成されたメソッド・スタブ
				return "yasushi-otsuka";
			}
		}
		TestValidator test = new TestValidator();
		test.initialize(new DataAnnotation2());
		test.isValid(null);
	}

}
