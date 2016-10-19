import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main15 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        for (int i = 1; i <= 9; i++) {
        	System.out.print(n * i);
        	if (i != 9) {
        		System.out.print(" ");
        	}
        }
    }
}