import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main07 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] data = new String[2][];
        for (int i = 0; i < 2; i++) {
            String line = br.readLine();
            line = line.trim();
    	    data[i] = line.split(" ");
        }
        int ans = Integer.parseInt(data[0][0]) * Integer.parseInt(data[1][1])
        		- Integer.parseInt(data[0][1]) * Integer.parseInt(data[1][0]);

		System.out.println(ans);
    }
}