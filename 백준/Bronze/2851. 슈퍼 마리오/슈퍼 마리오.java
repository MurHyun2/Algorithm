import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 0;
		int sum = 0;

		while (++T <= 10) {
			int input = Integer.parseInt(br.readLine());
			int sumResult = sum + input;

			if (sumResult > 100) {
				if (Math.abs(sumResult - 100) <= Math.abs(sum - 100))
					sum = sumResult;
				break;
			} else {
				sum += input;
			}
		}

		System.out.println(sum);
	}
}
