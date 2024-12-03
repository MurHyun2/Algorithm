import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[][] arr;
	static int[][] distArr;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		distArr = new int[N][M];
		int x = 0;
		int y = 0;

		for (int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine().trim());

			for (int c = 0; c < M; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());

				if (arr[r][c] == 2) {
					x = r;
					y = c;
				}
			}
		}
		// 입력 끝

		bfs(x, y);
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (arr[r][c] == 1 && distArr[r][c] == 0) {
					sb.append(-1).append(" ");
				} else {
					sb.append(distArr[r][c]).append(" ");
				}
			}
			
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { x, y });

		while (!q.isEmpty()) {
			int[] now = q.poll();
			int r = now[0];
			int c = now[1];

			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];

				if (nr == x && nc == y || nr < 0 || nc < 0 || nr >= N || nc >= M || arr[nr][nc] == 0
						|| distArr[nr][nc] != 0)
					continue;

				distArr[nr][nc] = distArr[r][c] + 1;
				q.add(new int[] { nr, nc });
			}
		}
	}
}