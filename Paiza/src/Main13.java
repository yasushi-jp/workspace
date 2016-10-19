import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main13 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = 3 - line.length();
        for (int i = 0; i < n; i++) {
        	line = "0" + line;
        }
        System.out.println(line);
    }
}