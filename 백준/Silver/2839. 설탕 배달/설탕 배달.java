import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int[] dp = new int[N + 1];

        // dp 배열 초기화
        Arrays.fill(dp, Integer.MAX_VALUE); // 초기 값을 매우 큰 값으로 설정
        dp[3] = 1;
        if (N >= 5) dp[5] = 1; // 5kg 봉지 1개

        for (int i = 6; i <= N; i++) {
            if (dp[i - 3] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - 3] + 1); // 3kg
            }

            if (dp[i - 5] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1); // 5kg
            }
        }

        // 정확히 나누어 떨어지지 않는 경우 -1 출력
        System.out.println(dp[N] == Integer.MAX_VALUE ? -1 : dp[N]);
    }
}
