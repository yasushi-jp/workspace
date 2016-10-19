import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC029 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int m = Integer.parseInt(data[0]);
        int n = Integer.parseInt(data[1]);

        int[] d = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
        	line = br.readLine();
        	String[] data2 = line.split(" ");
        	d[i] = Integer.parseInt(data2[0]);
        	r[i] = Integer.parseInt(data2[1]);
        }

        int s1 = 0;
        int s2 = 0;
        int e = 0;
        for (int i = 0; i < m - n + 1; i++) {
        	int etemp = 0;
        	for (int j = 0; j < n; j++) {
        		etemp = etemp + r[i + j];
        	}
 //       	System.out.println("etemp=" + etemp);
        	if (i == 0) {
            	s1 = d[i];
            	s2 = d[i + n - 1];
        		e = etemp;
        	} else {
        		if (e > etemp) {
                	s1 = d[i];
                	s2 = d[i + n - 1];
        			e = etemp;
        		}
        	}
        }
        System.out.println(s1 + " " + (s2));
    }
}