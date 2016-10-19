import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main00Temp {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
            String[] data = line.split(" ");

            System.out.println("hello = " + data[0] + " , world = " + data[1]);
        }
    }
}