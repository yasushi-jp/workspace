import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main27 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String num = br.readLine();
        int n = Integer.parseInt(num);
        System.out.println(str.substring(0, n));
    }
}