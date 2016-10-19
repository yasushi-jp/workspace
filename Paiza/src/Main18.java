import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main18 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");

        long kekka = 0;
        if ("km".equals(data[1])) {
        	kekka = Integer.parseInt(data[0]) * 1000 * 1000;
        } else if ("m".equals(data[1])) {
        	kekka = Integer.parseInt(data[0]) * 1000;
        } else if ("cm".equals(data[1])) {
        	kekka = Integer.parseInt(data[0]) * 10;
        }
        System.out.println(kekka);
    }
}