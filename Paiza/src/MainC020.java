import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC020 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] data = line.split(" ");
        double m = Double.parseDouble(data[0]);
        double p = Double.parseDouble(data[1]);
        double q = Double.parseDouble(data[2]);

        double nokori = (double)((m * (100 -p)) / 100);
        double nokori2 = (nokori * (100 - q)) / 100;

        System.out.println(nokori2);
    }
}