import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main11 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line.trim());
        int len = Integer.toString(n).length();
        System.out.println(len);
    }
}