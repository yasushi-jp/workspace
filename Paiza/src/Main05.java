import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main05 {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        String ans = null;
        switch (n) {
        case 5: ans = "A"; break;
        case 4: ans = "B"; break;
        case 3: ans = "C"; break;
        case 2: ans = "D"; break;
        case 1: ans = "E"; break;
        default: break;


        }

        System.out.println(ans);
    }
}
