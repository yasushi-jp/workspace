package test;

public class TestValidator {

	private String id;
	private String name;

	public void initialize(SampleTestAnnotation pattern) {
		id = pattern.id();
		name = pattern.name();
	}

	public void isValid(String value) {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
	}

}
