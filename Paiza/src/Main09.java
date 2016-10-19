import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main09 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String s = "at";

        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(line);
        String result = m.replaceAll("@");

        System.out.println(result);
    }
}