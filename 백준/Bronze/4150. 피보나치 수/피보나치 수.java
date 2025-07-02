import java.io.*;
import java.math.BigInteger;

public class Main {
	public static BigInteger[] dp;
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		dp = new BigInteger[N+1];
		
		dp[0] = BigInteger.valueOf(0);
		dp[1] = BigInteger.valueOf(1);
        
		if(N > 1) {
			dp[2]=BigInteger.valueOf(1);
        }
		
		for (int i = 3; i <= N; i++) {
			dp[i] = dp[i - 1].add(dp[i - 2]);
		}
		
		System.out.println(dp[N]);
	}
}