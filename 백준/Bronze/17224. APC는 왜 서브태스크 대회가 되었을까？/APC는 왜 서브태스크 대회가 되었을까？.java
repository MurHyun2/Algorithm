import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int easyCnt = 0; // sub1 <= L
        int hardCnt = 0; // sub2 <= L

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int sub1 = Integer.parseInt(st.nextToken());
            int sub2 = Integer.parseInt(st.nextToken());

            if (sub1 <= L) easyCnt++;
            if (sub2 <= L) hardCnt++;
        }

        int solveCnt = Math.min(K, easyCnt);
        int hardSolve = Math.min(K, hardCnt);

        int answer = 100 * solveCnt + 40 * hardSolve;
        System.out.println(answer);
    }
}