package test;

public class SampleMain {

	public static void main(String[] args) {
		System.out.println(SampleHash
				.getfileHash("glassfish-5.0.1.zip", SampleHash.SHA_512));
	}
}
