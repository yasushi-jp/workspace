import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC028 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int tensu = 0;

        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	String[] data = line.split(" ");
        	String q = data[0];
        	String a =data[1];

        	if (q.length() == a.length()) {
        		if (q.equals(a)) {
        			tensu = tensu + 2;
        		} else {
        			int ngcnt = 0;
        			for (int j= 0; j < q.length(); j++) {
        				String subq = q.substring(j, j + 1);
        				String suba = a.substring(j, j + 1);
        				if (!subq.equals(suba)) {
        					ngcnt++;
        				}
        			}
        			if (ngcnt == 1) {
        				tensu = tensu + 1;
        			}
        		}
        	}
        }
        System.out.println(tensu);
    }
}