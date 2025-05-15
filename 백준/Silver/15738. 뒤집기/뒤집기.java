import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
        int M = Integer.parseInt(st.nextToken());

        br.readLine();

        for (int m = 0; m < M; m++) {
            int i = Integer.parseInt(br.readLine());
            
            if (i > 0) {
                if (K < i) {
                    K = i - 1 - K;
                }
            } else {
                i = -i;
                if (K >= N - i) {
                    K = N - 1 - (K - (N - i));
                }
            }
        }

        System.out.println(K + 1);
    }
}