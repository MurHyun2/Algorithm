import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N + 1][N + 1];
        int[][] prefix = new int[N + 1][N + 1];

        for (int r = 1; r <= N; r++) {
            st = new StringTokenizer(br.readLine());

            for (int c = 1; c <= N; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
                prefix[r][c] = prefix[r - 1][c] + prefix[r][c - 1] + map[r][c] - prefix[r - 1][c - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            int sum = prefix[r2][c2] - prefix[r2][c1 - 1] - prefix[r1 - 1][c2] + prefix[r1 - 1][c1 - 1];

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}