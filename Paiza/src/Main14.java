import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main14 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        int ans = 180 - Integer.parseInt(line1) - Integer.parseInt(line2);
        System.out.println(ans);
    }
}