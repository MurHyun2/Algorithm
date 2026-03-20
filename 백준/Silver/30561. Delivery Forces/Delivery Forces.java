import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[1_000_001];
        int n = 0, c, x = 0, need, idx = 0;
        boolean first = true;

        while ((c = br.read()) != -1) {
            if (c > ' ') {
                x = x * 10 + (c - '0');
            } else if (x > 0) {
                if (first) {
                    n = x;
                    first = false;
                } else {
                    cnt[x]++;
                }
                x = 0;
            }
        }
        
        if (x > 0) cnt[x]++;

        need = n / 3 * 2;
        long ans = 0;

        for (int v = 1_000_000; v >= 1 && idx < need; v--) {
            while (cnt[v]-- > 0 && idx < need) {
                if ((idx & 1) == 1) ans += v;
                idx++;
            }
        }

        System.out.print(ans);
    }
}