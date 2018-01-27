package otsuka.hash;

public class Main {
	public static void main(String[] args) {

		byte[] b = SampleHash.getfileHash("C:\\Data\\otsuka\\003.pdf", SampleHash.SHA_512);
		System.out.println(SampleHash.byteArrayToString(b));
	}
}
