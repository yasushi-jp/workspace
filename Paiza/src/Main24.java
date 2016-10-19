import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main24 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int m = Integer.parseInt(data[0]);
        int n = Integer.parseInt(data[1]);
        System.out.println((m / n) + " " + (m % n));
    }
}