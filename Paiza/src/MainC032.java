import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC032 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        int[] kingaku = new int[4];

        for (int i = 0; i < kingaku.length; i++) {
        	kingaku[i] = 0;
        }

        for (int i = 0; i < n; i++) {
        	line = br.readLine();
            String[] data = line.split(" ");
            int v = Integer.parseInt(data[0]);
            int p = Integer.parseInt(data[1]);

            kingaku[v] = kingaku[v] + p;
        }

        int cnt = 0;
        for (int i = 0; i <= 3; i++) {
            switch (i) {
            case 0:
            	cnt = cnt + (kingaku[i] / 100) * 5;
            	break;
            case 1:
            	cnt = cnt + (kingaku[i] / 100) * 3;
            	break;
            case 2:
            	cnt = cnt + (kingaku[i] / 100) * 2;
            	break;
            case 3:
            	cnt = cnt + (kingaku[i] / 100);
            	break;
            }
        }
        System.out.println(cnt);
    }
}