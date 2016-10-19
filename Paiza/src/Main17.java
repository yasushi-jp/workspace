import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main17 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] array = line.split(" ");
        int syoko = Integer.parseInt(array[0]);
        int kosa = Integer.parseInt(array[1]);

        StringBuilder sb = new StringBuilder();
        int atai = syoko;
        sb.append(syoko);
        for (int i = 0; i < 9; i++) {
        	atai = atai + kosa;
        	sb.append(" ");
        	sb.append(atai);
        }
        System.out.println(sb.toString());
    }
}