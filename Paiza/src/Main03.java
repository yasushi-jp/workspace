import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main03 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        if (n1 == n2 && n2 == n3) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
   }
}