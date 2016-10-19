import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main28 {
    public static void main(String args[] ) throws Exception {
    	int[] n = new int[5];
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
        	n[i] = Integer.parseInt(br.readLine());
        }

        int max = n[0];
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
        	if (max < n[i]) {
        		max = n[i];
        	}
        	if (min > n[i]) {
        		min = n[i];
        	}
        }

        System.out.println(max);
        System.out.println(min);
    }
}