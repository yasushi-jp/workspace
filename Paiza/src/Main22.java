import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main22 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char[] carray = line.toUpperCase().toCharArray();
        int kekka = ((int)(carray[0] - 'A')) + 1;
        System.out.println(kekka);
    }
}