import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int Z = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            if (M == 0 && G == 0 && Z == 0 && S == 0 && E == 0) break;

            long ans = 0;

            for (int stalker = 0; stalker <= Math.min(M / 125, G / 50); stalker++) {
                int m1 = M - 125 * stalker;
                int g1 = G - 50 * stalker;

                int maxSentry = Math.min(m1 / 50, g1 / 100);

                for (int sentry = 0; sentry <= maxSentry; sentry++) {
                    int remainMineral = m1 - 50 * sentry;
                    int zealot = remainMineral / 100;

                    long power = 1L * zealot * Z + 1L * stalker * S + 1L * sentry * E;
                    ans = Math.max(ans, power);
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}