import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main08 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        int hon = Integer.parseInt(data[0]);
        int dansu = Integer.parseInt(data[1]);
        int haba = Integer.parseInt(data[2]);

        if (hon <= (dansu * haba)) {
        	System.out.println("OK");
        } else {
        	System.out.println("NG");
        }
    }
}