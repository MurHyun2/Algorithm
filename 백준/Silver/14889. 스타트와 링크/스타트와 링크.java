import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, min;
	static int[][] arr;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine().trim());
		arr = new int[N][N];
		visited = new boolean[N];
		min = Integer.MAX_VALUE;

		for (int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine().trim());

			for (int c = 0; c < N; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}

		comb(0, 0);

		System.out.println(min);

	}

	static void comb(int start, int depth) {
		if (depth == N / 2) {
			calMin();
			return;
		}

		for (int i = start; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				comb(i + 1, depth + 1);
				visited[i] = false;
			}
		}
	}

	static void calMin() {
		int a = 0, b = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visited[i] && visited[j]) {
					a += arr[i][j];
				} else if (!visited[i] && !visited[j]) {
					b += arr[i][j];
				}
			}
		}

		int sum = Math.abs(a - b);

		if (sum == 0) {
			System.out.println(0);
			System.exit(0);
		}

		min = Math.min(min, sum);
	}
}
