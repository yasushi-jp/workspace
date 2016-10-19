import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main29 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");

        int n = Integer.parseInt(data[1]);
        System.out.println(data[0].substring(n - 1, n));
    }
}