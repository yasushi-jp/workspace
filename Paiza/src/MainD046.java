import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainD046 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");

        int max = 0;
        for (int i = 0; i < data.length; i++) {
        	int num = Integer.parseInt(data[i]);
        	if (max < num) {
        		max = num;
        	}
        }
        System.out.println(max);
    }
}