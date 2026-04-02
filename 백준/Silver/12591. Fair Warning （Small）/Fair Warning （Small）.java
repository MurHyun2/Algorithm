import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            input.append(line).append(' ');
        }

        StringTokenizer st = new StringTokenizer(input.toString());
        int C = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= C; tc++) {
            int N = Integer.parseInt(st.nextToken());

            BigInteger first = new BigInteger(st.nextToken());
            BigInteger gcd = BigInteger.ZERO;

            for (int i = 1; i < N; i++) {
                BigInteger cur = new BigInteger(st.nextToken());
                BigInteger diff = cur.subtract(first).abs();
                gcd = gcd.gcd(diff);
            }

            BigInteger y = gcd.subtract(first.mod(gcd)).mod(gcd);

            sb.append("Case #").append(tc).append(": ").append(y).append('\n');
        }

        System.out.print(sb);
    }
}