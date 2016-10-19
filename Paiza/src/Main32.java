import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main32 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        System.out.println(6 * n * n);
    }
}