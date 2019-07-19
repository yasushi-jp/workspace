import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainD110 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] data = line.split(" ");
		int[] nums = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			nums[i] = Integer.parseInt(data[i]);
		}
		System.out.println(nums[0] * nums[1] * nums[2]);
	}
}
