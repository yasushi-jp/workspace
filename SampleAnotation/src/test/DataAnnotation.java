package test;

import java.lang.annotation.Annotation;

public class DataAnnotation implements SampleAnnotation {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO 自動生成されたメソッド・スタブ
		return SampleAnnotation.class;
	}

	@Override
	public String id() {
		// TODO 自動生成されたメソッド・スタブ
		return "05";
	}

	@Override
	public String name() {
		// TODO 自動生成されたメソッド・スタブ
		return "otsuka";
	}

}
