import java.util.*;

class Solution {
    int solution(int[][] land) {
        int n = land.length;
        
        int[][] dp = new int[n][4];
        for (int i = 0; i < n; i ++) {
            dp[i] = Arrays.copyOf(land[i], land[i].length);
        }
        
        for (int i = 1; i < n; i++) {
            dp[i][0] += Math.max(
                Math.max(dp[i - 1][1], dp[i - 1][2]),
                dp[i - 1][3]
            );
            
            dp[i][1] += Math.max(
                Math.max(dp[i - 1][0], dp[i - 1][2]),
                dp[i - 1][3]
            );
            
            dp[i][2] += Math.max(
                Math.max(dp[i - 1][0], dp[i - 1][1]),
                dp[i - 1][3]
            );
            
            dp[i][3] += Math.max(
                Math.max(dp[i - 1][0], dp[i - 1][1]),
                dp[i - 1][2]
            );
        }

        return Math.max(
            Math.max(dp[n - 1][0], dp[n - 1][1]),
            Math.max(dp[n - 1][2], dp[n - 1][3])
        );
    }
}