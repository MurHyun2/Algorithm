import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] modules = new int[n][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            modules[i][0] = Integer.parseInt(st.nextToken());
            modules[i][1] = i + 1;
        }
        // 입력 끝

        Arrays.sort(modules, (a, b) -> b[0] - a[0]);

        int r = 1;
        long max = 3L * modules[0][0];
        long preSum = modules[0][0];

        for (int i = 1; i < n; i++) {
            preSum += modules[i][0];
            long score = modules[0][0] + modules[i][0] + preSum;

            if (score > max) {
                max = score;
                r = i + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(r).append("\n");
        for (int i = 0; i < r; i++) {
            sb.append(modules[i][1]).append(" ");
        }

        System.out.println(sb);
    }
}