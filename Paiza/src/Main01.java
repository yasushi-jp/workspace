import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main01 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String readLine = br.readLine();
            readLine = readLine.trim();
            String[] readLineArray = readLine.split("\\.");
            boolean hantei = true;
            if (readLineArray.length != 4) {
            	hantei = false;
            } else {
	            for (int j=0; j < 4; j++ ) {
	                try {
	                    int num = Integer.parseInt(readLineArray[j]);
    	            	if (num > 255 || num < 0) {
    	            		hantei = false;
    	            		break;
    	            	}

	                } catch(Exception e) {
	                    hantei =false;

	                }
	            }
            }
            if (hantei) {
            	System.out.println("True");
            } else {
            	System.out.println("False");
            }
        }
    }
}