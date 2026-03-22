import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long D = Long.parseLong(st.nextToken());

            int count = 0;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                long v = Long.parseLong(st.nextToken());
                long f = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());

                if (D * c <= v * f) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}