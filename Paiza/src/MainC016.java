import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC016 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
        	String ch = line.substring(i, i + 1);
        	if ("A".equals(ch)) {
        		sb.append("4");
        	} else if ("E".equals(ch)) {
        		sb.append("3");
        	} else if ("G".equals(ch)) {
        		sb.append("6");
        	} else if ("I".equals(ch)) {
        		sb.append("1");
        	} else if ("O".equals(ch)) {
        		sb.append("0");
        	} else if ("S".equals(ch)) {
        		sb.append("5");
        	} else if ("Z".equals(ch)) {
        		sb.append("2");
        	} else {
        		sb.append(ch);
        	}
        }
        System.out.println(sb.toString());
    }
}