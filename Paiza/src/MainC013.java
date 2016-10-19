import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainC013 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 嫌いな数字
        String line1 = br.readLine();
        int kirai = Integer.parseInt(line1);

        // 病室の総数
        String line2 = br.readLine();
        int cnt = Integer.parseInt(line2);

        int eqcnt = 0;
        for (int i = 0; i < cnt; i++) {
            String roomNo = br.readLine();
            boolean okFlg = true;

            for (int j = 0; j < roomNo.length(); j++) {
            	String ch1 = roomNo.substring(j, j + 1);

            	int no = Integer.parseInt(ch1);
            	if (no == kirai) {
            		okFlg = false;
            		break;
            	}
            }

            if (okFlg) {
            	eqcnt++;
            	System.out.println(roomNo);
            }
        }

        if (eqcnt == 0) {
        	System.out.println("none");
        }
    }
}