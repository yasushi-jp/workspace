import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        if (n >= 0 && n <= 30) {
        	System.out.println("sunny");
        } else if (n > 30 && n<= 70) {
        	System.out.println("cloudy");
        } else if (n > 70 && n <= 100) {
        	System.out.println("rainy");
        }

    }
}