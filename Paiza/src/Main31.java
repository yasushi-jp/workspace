import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main31 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int cnt = 0;
        for (int i = 0; i < line.length(); i++) {
        	if ("A".equals(line.substring(i, i + 1))) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}