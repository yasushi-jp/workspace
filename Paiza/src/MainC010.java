import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC010 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1行目読み込み
        String line = br.readLine();
        String[] data1 = line.split(" ");

        // 工事現場のx座標
        int koujiA = Integer.parseInt(data1[0]);
        // 工事現場のy座標
        int koujiB = Integer.parseInt(data1[1]);
        // 工事現場の騒音の大きさ
        int koujiR = Integer.parseInt(data1[2]);

        // 2行目読み込み
        line = br.readLine();
        // 木陰の数
        int n = Integer.parseInt(line);

        // 木陰の数ループ
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] dataXY = line.split(" ");
            int x = Integer.parseInt(dataXY[0]);
            int y = Integer.parseInt(dataXY[1]);

            int sahen = (x - koujiA) * (x - koujiA) + (y - koujiB) * (y - koujiB);
            int uhen = koujiR * koujiR;
            if (sahen >= uhen) {
            	System.out.println("silent");
            } else {
            	System.out.println("noisy");
            }

        }
    }
}