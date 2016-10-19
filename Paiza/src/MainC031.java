import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC031 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        String[] cities = new String[n];
        int[] jisa = new int[n];
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	String[] data = line.split(" ");
        	cities[i] = data[0];
        	jisa[i] = Integer.parseInt(data[1]);
        }

        line = br.readLine();
        String[] data2 = line.split(" ");
        String city0 = data2[0];
        String time = data2[1];

        String[] data3 = time.split(":");
        int h = Integer.parseInt(data3[0]);
        String mm = data3[1];

        int ii = 0;
        for (int i = 0; i < n; i++) {
        	if (city0.equals(cities[i])) {
        		ii = i;
        	}
        }
        int jisa0 = jisa[ii];

        for (int i = 0; i < n; i++) {
        	int h2 = h + jisa[i] - jisa0;
        	int outH = h2 % 24;

        	if (outH < 0) {
        		outH = 24 + outH;
        	}
        	if (outH < 10) {
        		System.out.println("0" + outH + ":" + mm);
        	} else {
        		System.out.println(outH + ":" + mm);
        	}
        }


    }
}