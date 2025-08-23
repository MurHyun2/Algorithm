import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] map;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, -1, 0, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[2][n];
        visited = new boolean[2][n];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        boolean hasZero = false;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            if (r == 1 && c == n - 1) return hasZero ? 1 : 2;

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr < 0 || nc < 0 || nr >= 2 || nc >= n || visited[nr][nc]) continue;
                if (map[nr][nc] == 0) {
                    hasZero = true;
                    continue;
                }

                visited[nr][nc] = true;
                q.offer(new int[]{nr, nc});
            }
        }

        return 0;
    }
}