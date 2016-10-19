import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main19 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        if ((n % 2) == 0) {
        	System.out.println("even");
        } else {
        	System.out.println("odd");
        }
    }
}