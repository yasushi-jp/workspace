import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC021 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int xc = Integer.parseInt(data[0]);
        int yc = Integer.parseInt(data[1]);
        int r1 = Integer.parseInt(data[2]);
        int r2 = Integer.parseInt(data[3]);

        line = br.readLine();
        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] basyo = line.split(" ");
            int xi = Integer.parseInt(basyo[0]);
            int yi = Integer.parseInt(basyo[1]);

            int atai = (xi - xc) * (xi - xc) + (yi -yc) * (yi -yc);

            if ((r1 * r1) <= atai && atai <= (r2 * r2)) {
            	System.out.println("yes");
            } else {
            	System.out.println("no");
            }
        }
    }
}