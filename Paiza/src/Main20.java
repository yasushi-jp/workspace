import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main20 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int kekka = b - a;
        System.out.println(kekka);
    }
}