import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main12 {
    public static void main(String args[] ) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for (int i = 0; i < 7; i++) {
        	String line = br.readLine();
        	if ("no".equals(line)) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}