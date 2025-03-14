import java.util.*;
import java.io.*;

public class Main {

    static int R, C, max;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static char[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String input = br.readLine();

            for (int j = 0; j < C; j++) {
                map[i][j] = input.charAt(j);
            }
        }

        max = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'L') {
                    visited = new boolean[R][C];
                    bfs(i, j, 0);
                }
            }
        }

        System.out.println(max);
    }

    private static void bfs(int r, int c, int depth) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c, depth});
        visited[r][c] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int k = 0; k < 4; k++) {
                int nr = cur[0] + dr[k];
                int nc = cur[1] + dc[k];

                if (nr < 0 || nr >= R || nc < 0 || nc >= C || visited[nr][nc] || map[nr][nc] == 'W') {
                    continue;
                }

                visited[nr][nc] = true;
                q.add(new int[]{nr, nc, cur[2] + 1});
            }

            max = Math.max(max, cur[2]);
        }
    }
}