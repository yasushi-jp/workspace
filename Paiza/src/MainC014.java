import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC014 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 箱の数n, ボールの半径r 表す整数
        String line = br.readLine();
        String[] data1 = line.split(" ");
        int n = Integer.parseInt(data1[0]);
        int r = Integer.parseInt(data1[1]);

        int tyokkei = r * 2;

        for (int i = 0; i < n; i++) {
        	// i個目の箱の高さ、幅、奥行きを表す整数
        	line = br.readLine();
            String[] hako = line.split(" ");
            int h = Integer.parseInt(hako[0]);
            int w = Integer.parseInt(hako[1]);
            int d = Integer.parseInt(hako[2]);

            if ((tyokkei <= h) && (tyokkei <= w) && (tyokkei <= d)) {
            	System.out.println(i + 1);
            }
        }
    }
}