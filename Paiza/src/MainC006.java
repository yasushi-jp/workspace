import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MainC006 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1行目読み込み
        String line1 = br.readLine();
        String[] data1 = line1.split(" ");
        // 1行目１つめ（カード数）
        int pcnt = Integer.parseInt(data1[0]);
        // 1行目２つめ（人数）
        int nizu = Integer.parseInt(data1[1]);
        // 1行目３つめ（表示する数）
        int disp = Integer.parseInt(data1[2]);

        // 2行目読み込み
        String line2 = br.readLine();
        String[] data2 = line2.split(" ");

        // カード得点設定
        double[] tokuten = new double[pcnt];
        for (int i = 0; i < pcnt; i++) {
        	tokuten[i] = Double.parseDouble(data2[i]);
        }

        // 3行目以降
        int[][] maisu = new int[nizu][pcnt];
        // 人数分行を読み込み
        for (int i = 0; i < nizu; i++) {
            String linen = br.readLine();
            String[] datan = linen.split(" ");
            // カード数分ループ
            for (int j = 0; j < pcnt; j++) {
            	maisu[i][j] = Integer.parseInt(datan[j]);
            }
        }

        double[] top = new double[nizu];
        for (int i = 0; i < nizu; i++) {
        	top[i] = 0f;
        	for (int j = 0; j < pcnt; j++) {
        		top[i] = top[i] + (tokuten[j] * maisu[i][j]);
        	}
        }

        Arrays.sort(top);

        for (int i = 0; i < disp; i++) {
        	System.out.println(Math.round(top[nizu - i - 1]));
        }
    }
}