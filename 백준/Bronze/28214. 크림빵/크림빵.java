import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int zeroCount = 0;

            for (int j = 0; j < K; j++) {
                int bread = Integer.parseInt(st.nextToken());
                if (bread == 0) {
                    zeroCount++;
                }
            }

            if (zeroCount < P) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}