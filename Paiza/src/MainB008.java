import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainB008 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] datanm = line.split(" ");
        // 会員数
        int n = Integer.parseInt(datanm[0]);
        // ライブイベントの数
        int m = Integer.parseInt(datanm[1]);

        int goukei = 0;
        if (n > 0) {
	        for (int i = 0; i < m; i++) {
	        	line = br.readLine();
	            String[] data = line.split(" ");
	            int cnt = 0;
	            for (int j = 0; j < n; j++) {
	            	cnt =  cnt + Integer.parseInt(data[j]);
	            }
	            if (cnt > 0) {
	            	goukei = goukei + cnt;
	            }
	        }
        }
        System.out.println(goukei);
    }
}