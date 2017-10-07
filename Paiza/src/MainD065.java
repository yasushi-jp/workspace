import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainD065 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        if (n >= 200 && n <= 299) {
        	System.out.println("ok");
        } else if (n >= 400 && n <= 499) {
        	System.out.println("error");
        } else {
        	System.out.println("unknown");
        }
    }
}