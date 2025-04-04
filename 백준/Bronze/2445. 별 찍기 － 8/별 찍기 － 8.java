import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());

		for (int i = 1; i <= N; i++) {
			int space = (N * 2) - (2 * i);

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			for (int j = 1; j <= space; j++)
				System.out.print(" ");

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}

		for (int i = N - 1; i >= 1; i--) {
			int space = (N * 2) - (2 * i);

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			for (int j = 1; j <= space; j++)
				System.out.print(" ");

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}
	}
}
