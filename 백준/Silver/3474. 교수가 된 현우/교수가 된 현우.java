import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int twoCnt = 0;
            int fiveCnt = 0;

            for (int j = 2; j <= num ; j *= 2) {
                twoCnt += num / j;
            }

            for (int j = 5; j <= num ; j *= 5) {
                fiveCnt += num / j;
            }

            sb.append(Math.min(twoCnt, fiveCnt)).append("\n");
        }

        System.out.println(sb);
    }
}