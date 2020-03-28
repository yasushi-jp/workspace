package otsuka.hash;

public class Main {
	public static void main(String[] args) {

		byte[] b = null;
		b = SampleHash.getfileHash("C:\\Data\\otsuka\\003.pdf", SampleHash.SHA_512);
		System.out.println(SampleHash.byteArrayToString(b));
		System.out.println(SampleHash.byteArrayToString2(b));
		b = SampleHash.getHash("大塚", SampleHash.MD5);
		System.out.println(SampleHash.byteArrayToString(b));
		System.out.println(SampleHash.byteArrayToString2(b));
	}
}
