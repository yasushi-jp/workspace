import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] data = line.split(" ");
		int[] dataNum = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			dataNum[i] = Integer.parseInt(data[i]);
		}

		if (dataNum[0] == 0) {
			System.out.print(dataNum[1] / 2); // 賭けチップ数
		} else {
			int total = 0;
			for (int i = 0; i < dataNum.length; i++) {
				total += dataNum[i];
			}
			if (total < 12) { // ★カードを引く条件の合計値を変えてみよう！★
				System.out.print("HIT");// カード引く
			} else {
				System.out.print("STAND");// 勝負
			}
		}


	}
}