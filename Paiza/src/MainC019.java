import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MainC019 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 整数の個数
        String line = br.readLine();
        int cnt = Integer.parseInt(line);
        for (int i = 0; i < cnt; i++) {
        	// 整数
            line = br.readLine();
            int n = Integer.parseInt(line);

            List<Integer> list = new ArrayList<Integer>();
            for (int j = 2; j <= n - 1; j++) {
            	if ((n% j) == 0) {
            		list.add(j);
            	}
            }
            int gokei = 1;
            Iterator<Integer> it = list.iterator();
            while(it.hasNext()) {
            	int yakusu = it.next().intValue();
            	gokei = gokei + yakusu;
            }
            if (gokei == n) {
            	System.out.println("perfect");
            } else if (Math.abs(n - gokei) == 1) {
            	System.out.println("nearly");
            } else {
            	System.out.println("neither");
            }
        }
    }
}