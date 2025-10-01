import java.util.*;
import java.io.*;

class Main {

    static int[] dr = {1, 0};
    static int[] dc = {0, 1};
    static int n;
    static int[][] arr;
    static long[][] dp;

    static long dfs(int r, int c) {
        if (r == n - 1 && c == n - 1) return 1;
        if (dp[r][c] != -1) return dp[r][c];

        dp[r][c] = 0;
        int jump = arr[r][c];

        for (int i = 0; i < 2; i++) {
            int nr = r + dr[i] * jump;
            int nc = c + dc[i] * jump;

            if (nr < n && nr >= 0 && nc < n && nc >= 0) {
                dp[r][c] += dfs(nr, nc);
            }
        }

        return dp[r][c];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new long[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        // 입력 끝

        System.out.println(dfs(0, 0));
    }
}