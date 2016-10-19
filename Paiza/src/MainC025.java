import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MainC025 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1回で運べる枚数
        String line = br.readLine();
        int mone = Integer.parseInt(line);

        // ファックスが届く回数
        line = br.readLine();
        int n = Integer.parseInt(line);

        int[] h = new int[n];
        int[] m = new int[n];
        int[] maisu = new int[n];
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	String[] data = line.split(" ");
        	h[i] = Integer.parseInt(data[0]);
        	m[i] = Integer.parseInt(data[1]);
        	maisu[i] = Integer.parseInt(data[2]);
        }

        List<Integer> maisuList = new ArrayList<Integer>();
        int cnt = maisu[0];
        for (int i = 1; i < n; i++) {
        	if (h[i] == h[i -1]) {
        		cnt = cnt + maisu[i];
        	} else {
        		maisuList.add(cnt);
        		cnt = maisu[i];
        	}
        }
		maisuList.add(cnt);



        List<Integer> kaisuList = new ArrayList<Integer>();
		Iterator<Integer> it = maisuList.iterator();
		while (it.hasNext()) {
			int gokei = it.next();
//			System.out.println("gokei=" + gokei);
			int kaisu = gokei / mone;
			if ((gokei % mone) > 0) {
				kaisu++;
			}
			kaisuList.add(kaisu);
//			System.out.println("kaisu=" + kaisu);
		}

		Iterator<Integer> it2 = kaisuList.iterator();
		int out = 0;
		while (it2.hasNext()) {
			out = out + it2.next();
		}
		System.out.println(out);

    }
}