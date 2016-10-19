import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC015 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 各レシートの数
        String line = br.readLine();
        int n = Integer.parseInt(line);

        // ポイント
        int point = 0;
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] resheet = line.split(" ");
            // 日付
            String d = resheet[0];
            // 購入金額
            int p = Integer.parseInt(resheet[1]);

            if (d.indexOf("3") >= 0) {
            	point = point + p * 3 / 100;
            } else if (d.indexOf("5") >= 0) {
            	point = point + p * 5 / 100;
            } else {
            	point = point + p / 100;
            }
        }
        System.out.println(point);
    }
}