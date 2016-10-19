import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainC022 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        int s = 0;
        int e = 0;
        int h = 0;
        int l = 0;
        int ei = 0;


        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] data = line.split(" ");
            int si = Integer.parseInt(data[0]);
            ei = Integer.parseInt(data[1]);
            int hi = Integer.parseInt(data[2]);
            int li = Integer.parseInt(data[3]);
            if (i == 0) {
            	s = si;
            	l = li;
            }
            if (h < hi) {
            	h = hi;
            }
            if (l > li) {
            	l = li;
            }
         }
        e = ei;
        System.out.println(s + " " + e + " " + h + " " + l);
    }
}