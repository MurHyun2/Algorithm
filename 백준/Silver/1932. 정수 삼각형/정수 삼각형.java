import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                if (!st.hasMoreTokens()) {
                    break;
                }

                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        for (int r = 1; r < N; r++) {
            for (int c = 0; c <= r; c++) {
                if (c == 0) {
                    dp[r][c] = Math.max(dp[r][c], arr[r][c] + dp[r - 1][c]);
                    continue;
                }
                dp[r][c] = Math.max(arr[r][c] + dp[r - 1][c - 1], arr[r][c] + dp[r - 1][c]);
            }
        }

        int max = 0;
        for (int c = 0; c < N; c++) {
            max = Math.max(dp[N - 1][c], max);
        }

        System.out.println(max);
    }
}