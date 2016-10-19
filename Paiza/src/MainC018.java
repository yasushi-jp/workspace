import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MainC018 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // レシピの食材の数
        String line = br.readLine();
        int n = Integer.parseInt(line);

        String[] a = new String[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] data = line.split(" ");
            a[i] = data[0];
            b[i] = Integer.parseInt(data[1]);
        }

        // 所持している食材の数
        line = br.readLine();
        int m = Integer.parseInt(line);
        String[] c = new String[m];
        int[] d = new int[m];
        for (int i = 0; i < m; i++) {
            line = br.readLine();
            String[] data = line.split(" ");
            c[i] = data[0];
            d[i] = Integer.parseInt(data[1]);
        }

        // 作れる数
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
        	h[i] = 0;
            for (int j = 0; j < m; j++) {
            	if (a[i].equals(c[j])) {
            		h[i] = d[j] / b[i];
            	}
            }
        }

        Arrays.sort(h);
        System.out.println(h[0]);
    }
}