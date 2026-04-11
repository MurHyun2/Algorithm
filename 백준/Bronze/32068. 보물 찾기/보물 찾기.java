import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long L = Long.parseLong(st.nextToken());
            long R = Long.parseLong(st.nextToken());
            long S = Long.parseLong(st.nextToken());

            long leftStep = 2 * (S - L) + 1;
            long rightStep = 2 * (R - S);

            sb.append(Math.min(leftStep, rightStep)).append('\n');
        }

        System.out.print(sb);
    }
}