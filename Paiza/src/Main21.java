import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main21 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        System.out.println(line1 + "@" + line2);
    }
}