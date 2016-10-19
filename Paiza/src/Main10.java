import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main10 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] name = line.split(" ");
        System.out.println(name[0].substring(0,1) + "." + name[1].substring(0,1));
    }
}