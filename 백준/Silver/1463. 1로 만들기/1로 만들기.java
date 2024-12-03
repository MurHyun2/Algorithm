import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine().trim());

		arr = new int[N + 1];
        
        if (N == 1) {
			System.out.println(0);
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (i <= 3) {
				arr[i] = 1;
				continue;
			}

			int cnt = arr[i - 1] + 1;

			if (i % 3 == 0)
				cnt = Math.min(cnt, arr[i] = arr[i / 3] + 1);

			if (i % 2 == 0)
				cnt = Math.min(cnt, arr[i] = arr[i / 2] + 1);
			
			arr[i] = cnt;
		}
		
		System.out.println(arr[N]);
	}
}
