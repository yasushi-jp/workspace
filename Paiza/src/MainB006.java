import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainB006 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data1 = line.split(" ");

        // 初期値点の高さ
        int o_y = Integer.parseInt(data1[0]);
        // 初速
        int s = Integer.parseInt(data1[1]);
        // 確度
        int kakudo = Integer.parseInt(data1[2]);

        line = br.readLine();
        String[] data2 = line.split(" ");
        // 的までの距離
        int x = Integer.parseInt(data2[0]);
        // 的の高さ
        int y = Integer.parseInt(data2[1]);
        // 的の直径
        int a = Integer.parseInt(data2[2]);

        double temp1 = o_y + x * Math.tan(Math.toRadians((double)kakudo));
        double temp2 = 9.8 * x * x;
        double temp3 = 2 * s * s * Math.cos(Math.toRadians((double)kakudo)) * Math.cos(Math.toRadians((double)kakudo));

        double y_h = temp1 - (temp2 / temp3);

        double out = Math.abs(y_h - y);

        if (out > (a / 2.0)) {
        	System.out.println("Miss");
        } else {
        	System.out.println("Hit " + Math.round(out * 10) / 10.0);
        }
    }
}