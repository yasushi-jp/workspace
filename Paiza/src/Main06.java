import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main06 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] data = new String[2][];
        for (int i = 0; i < 2; i++) {
            String line = br.readLine();
            line = line.trim();
    	    data[i] = line.split(" ");
        }
        for (int i = 0; i < 2; i++) {
        	for (int j = 0; j < 2; j ++) {
        		System.out.println(data[i][j]);
        	}
        }
    }
}