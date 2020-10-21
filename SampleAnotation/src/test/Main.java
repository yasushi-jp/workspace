package test;

public class Main {

	public static void main(String[] args) {

		DataTestAnnotation data = new DataTestAnnotation();
		TestValidator test = new TestValidator();
		test.initialize(data);
		test.isValid(null);
	}

}
