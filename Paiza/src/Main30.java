import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main30 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data1 = br.readLine();
        String data2 = br.readLine();

        if (data1.equals(data2)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}