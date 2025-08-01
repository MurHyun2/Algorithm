import java.io.*;
import java.util.*;

public class Main {

    static int R, C, K, cnt;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static String[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);
        cnt = 0;
        map = new String[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            input = br.readLine().split("");

            for (int j = 0; j < C; j++) {
                map[i][j] = input[j];
            }
        }
        // 입력 끝

        visited[R - 1][0] = true;
        dfs(R - 1, 0, 1);

        System.out.println(cnt);
    }

    private static void dfs(int r, int c, int sum) {
        if (r == 0 && c == C - 1 && sum == K) {
            cnt++;
            return;
        }

        if (sum >= K) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr < 0 || nc < 0 || nr >= R || nc >= C || map[nr][nc].equals("T") || visited[nr][nc]) {
                continue;
            }

            visited[nr][nc] = true;
            dfs(nr, nc, sum + 1);
            visited[nr][nc] = false;
        }
    }
}