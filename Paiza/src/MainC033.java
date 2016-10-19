import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC033 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);

        int ball = 0;
        int strike = 0;

        for (int i = 0; i < n; i++) {
            line = br.readLine();
            if ("strike".equals(line)) {
            	strike++;
            	if (strike == 3) {
            		System.out.println("out!");
            		break;
            	} else {
            		System.out.println("strike!");
            	}
            } else if ("ball".equals(line)) {
            	ball++;
            	if (ball == 4) {
            		System.out.println("fourball!");
            		break;
            	}else {
            		System.out.println("ball!");
            	}
            }
        }
    }
}