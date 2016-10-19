import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC008 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        String str = br.readLine();
        while (str.length() > 0) {
	        int s1 = str.indexOf(data[0]);
	        int s2 = str.indexOf(data[1]);
	        if (s1 < 0) break;
	        if (s2 < 0) break;
//	        System.out.println(s1 + ", " + s2);
	        String disp = str.substring(s1 + data[0].length(), s2);
	        if ("".equals(disp)) {
	        	System.out.println("<blank>");
	        } else {
	        	System.out.println(disp);
	        }
	        str = str.substring(s2 + data[1].length());
//	        System.out.println(str);
        }
    }
}