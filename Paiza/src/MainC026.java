import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC026 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int n = Integer.parseInt(data[0]);
        int s = Integer.parseInt(data[1]);
        int p = Integer.parseInt(data[2]);

        int min = s - p;
        int max = s + p;

        int cnt = 0;
        int mm = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	String[] data2 = line.split(" ");
        	int mi = Integer.parseInt(data2[0]);
        	int si = Integer.parseInt(data2[1]);

        	if (min <= si && si <= max) {
        		cnt++;
        		if (mm < mi) {
        			mm = mi;
        			out = i + 1;
        		}
        	}
        }
        if (cnt > 0) {
        	System.out.println(out);
        } else {
        	System.out.println("not found");
        }
    }
}