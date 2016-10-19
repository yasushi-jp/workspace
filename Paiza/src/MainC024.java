import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC024 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] hensu = {0,0};

        String line = br.readLine();
        int n = Integer.parseInt(line);
        for (int index = 0; index < n; index++) {
        	line = br.readLine();
        	String[] data = line.split(" ");
        	int a = 0;
        	if ("SET".equals(data[0])) {
            	int i = Integer.parseInt(data[1]);
        		a = Integer.parseInt(data[2]);
        		hensu[i - 1] = a;
        	} else if ("ADD".equals(data[0])) {
        		a = Integer.parseInt(data[1]);
        		hensu[1] = hensu[0] + a;
        	} else if ("SUB".equals(data[0])) {
        		a = Integer.parseInt(data[1]);
        		hensu[1] = hensu[0] - a;
        	}
        }
        System.out.println(hensu[0] + " " + hensu[1]);
    }
}