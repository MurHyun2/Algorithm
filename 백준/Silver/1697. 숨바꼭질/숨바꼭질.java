import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, K;
	static int[] arr;
	static Queue<Integer> q = new LinkedList<>();

	static void bfs() {
		while (!q.isEmpty()) {
			int now = q.poll();

			int minArr = now - 1;
			int plusArr = now + 1;
			int mulArr = now * 2;

			if (minArr >= 0 && arr[minArr] == 0) {
				arr[minArr] = arr[now] + 1;
				q.add(minArr);
			}

			if (plusArr < 100001 && arr[plusArr] == 0) {
				arr[plusArr] = arr[now] + 1;
				q.add(plusArr);
			}

			if (mulArr < 100001 && arr[mulArr] == 0) {
				arr[mulArr] = arr[now] + 1;
				q.add(mulArr);
			}

			if (arr[K] != 0)
				return;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[100001];

		arr[N] = 1;
		q.add(N);
		bfs();

		System.out.println(arr[K] - 1);
	}
}
