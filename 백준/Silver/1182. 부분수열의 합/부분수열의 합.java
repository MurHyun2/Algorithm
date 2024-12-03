import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	static int N, S, cnt;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		cnt = 0;

		st = new StringTokenizer(br.readLine().trim());

		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		subs();

		System.out.println(cnt);
	}

	private static void subs() {
		for (int i = 1; i < (1 << N); i++) {
			int sum = 0;

			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) != 0) {
					sum += arr[j];
				}
			}
			
			if (sum == S)
				cnt++;
		}
	}
}
