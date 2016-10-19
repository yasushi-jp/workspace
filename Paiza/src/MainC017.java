import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC017 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] oya = line.split(" ");
        int oya1 = Integer.parseInt(oya[0]);
        int oya2 = Integer.parseInt(oya[1]);

        line = br.readLine();
        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
            line = br.readLine();
            String[] ko = line.split(" ");
            int ko1 = Integer.parseInt(ko[0]);
            int ko2 = Integer.parseInt(ko[1]);

            if (oya1 > ko1) {
            	System.out.println("High");
            } else if (oya1 < ko1) {
            	System.out.println("Low");
            } else {
            	if (oya2 < ko2) {
            		System.out.println("High");
            	} else {
            		System.out.println("Low");
            	}
            }
        }
    }
}