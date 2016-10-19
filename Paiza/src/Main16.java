import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main16 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            if (i == 0) {
            	sb.append(" ");
            } else {
            	sb.append(",");
            }
            sb.append(line);
        }
        sb.append(".");
        System.out.println(sb.toString());
    }
}