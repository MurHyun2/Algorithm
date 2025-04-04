import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int[][] list = new int[100][100];
		int[] x = new int[T];
		int[] y = new int[T];

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < T; i++) {
			int xNum = x[i];
			int yNum = y[i];

			for (int j = x[i]; j < x[i] + 10; j++) {
				for (int j2 = y[i]; j2 < y[i] + 10; j2++) {
					list[j][j2] = 1;
				}
			}
		}

		int result = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == 1)
					result++;
			}
		}

		System.out.println(result);
	}
}
