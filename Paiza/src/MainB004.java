import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainB004 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] ip = line.split("\\.");

        int ip3flg = 0;		// 0:数値、1:範囲、2:全て
        int ip4flg = 0;		// 0:数値、1:範囲、2:全て

        int ip3start = 0;
        int ip3end = 0;
        int ip4start = 0;
        int ip4end = 0;

        int cip1 = Integer.parseInt(ip[0]);
        int cip2 = Integer.parseInt(ip[1]);

//        System.out.println(ip[2]);
        if (ip[2].indexOf("-") >= 0) {
        	String tmp = ip[2].replaceAll("\\[", "");
        	tmp = tmp.replaceAll("\\]", "");
        	String[] tmp2 = tmp.split("-");
        	ip3flg = 1;
        	ip3start = Integer.parseInt(tmp2[0]);
        	ip3end = Integer.parseInt(tmp2[1]);
        } else if("*".equals(ip[2])) {
        	ip3flg = 2;
        } else {
        	ip3flg = 0;
        	ip3start = Integer.parseInt(ip[2]);
        	ip3end = Integer.parseInt(ip[2]);
        }

        if (ip[3].indexOf("-") >= 0) {
        	String tmp = ip[3].replaceAll("\\[", "");
        	tmp = tmp.replaceAll("\\]", "");
        	String[] tmp2 = tmp.split("-");
        	ip4flg = 1;
        	ip4start = Integer.parseInt(tmp2[0]);
        	ip4end = Integer.parseInt(tmp2[1]);
        } else if("*".equals(ip[3])) {
        	ip4flg = 2;
        } else {
        	ip4flg = 0;
        	ip4start = Integer.parseInt(ip[3]);
        	ip4end = Integer.parseInt(ip[3]);
        }

        line = br.readLine();
        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	String[] data = line.split(" ");

        	String[] logip = data[0].split("\\.");
        	int logip1 = Integer.parseInt(logip[0]);
        	int logip2 = Integer.parseInt(logip[1]);
        	int logip3 = Integer.parseInt(logip[2]);
        	int logip4 = Integer.parseInt(logip[3]);

        	boolean ok3 = false;
        	if (ip3flg == 2) {
        		ok3 = true;
        	} else {
        		if (logip3 >= ip3start && logip3 <= ip3end) {
        			ok3 = true;
        		} else {
        			ok3 = false;
        		}
        	}

        	boolean ok4 = false;
        	if (ip4flg == 2) {
        		ok4 = true;
        	} else {
        		if (logip4 >= ip4start && logip4 <= ip4end) {
        			ok4 = true;
        		} else {
        			ok4 = false;
        		}
        	}

        	boolean ok1 = false;
        	if (cip1 ==logip1) {
        		ok1 = true;
        	} else {
        		ok1 = false;
        	}
        	boolean ok2 = false;
        	if (cip2 ==logip2) {
        		ok2 = true;
        	} else {
        		ok2 = false;
        	}


        	if (ok1 && ok2 && ok3 && ok4) {
        		System.out.println(data[0] + " " + data[3].replaceAll("\\[", "") + " " + data[6]);
        	}

        }
    }

}