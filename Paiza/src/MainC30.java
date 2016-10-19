import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC30 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int h = Integer.parseInt(data[0]);
        int w = Integer.parseInt(data[1]);

        for (int i = 0; i < h; i++) {
        	line = br.readLine();
        	String[] pa = line.split(" ");
            StringBuilder sb = new StringBuilder();
        	for (int j = 0; j < w; j++) {
        		if (j != 0) {
        			sb.append(" ");
        		}
        		int p = Integer.parseInt(pa[j]);
        		if (p >= 128) {
        			sb.append("1");
        		} else {
        			sb.append("0");
        		}
        	}
        	System.out.println(sb.toString());
        }
    }
}