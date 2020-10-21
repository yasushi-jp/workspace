package test;

public class Main {

	public static void main(String[] args) {

		DataAnnotation data = new DataAnnotation();
		TestValidator test = new TestValidator();
		test.initialize(data);
		test.isValid(null);
	}

}
