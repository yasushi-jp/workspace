import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC023 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data0 = line.split(" ");

        int[] tousen = new int[6];
        for (int i = 0; i < 6; i++) {
        	tousen[i] = Integer.parseInt(data0[i]);
        }

        line = br.readLine();
        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	String[] data = line.split(" ");
        	int cnt = 0;
        	for (int j = 0; j < 6; j++) {
        		int kuji = Integer.parseInt(data[j]);
        		for (int m = 0; m < 6; m++) {
        			if (kuji == tousen[m]) {
        				cnt++;
        			}
        		}
        	}
        	System.out.println(cnt);
        }
    }
}