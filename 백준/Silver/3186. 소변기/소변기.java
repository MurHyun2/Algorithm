import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        char[] data = br.readLine().toCharArray();

        int usingTime = 0;
        int unUsingTime = 0;
        boolean isFlush = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (data[i] == '1') {
                usingTime++;
                unUsingTime = 0;
            } else {
                if (usingTime >= K) {
                    unUsingTime++;
                } else {
                    usingTime = 0;
                }
            }

            if (usingTime >= K && unUsingTime == L) {
                isFlush = true;
                sb.append(i + 1).append("\n");
                usingTime = 0;
                unUsingTime = 0;
            }
        }

        if (usingTime >= K) {
            isFlush = true;
            sb.append(L + N);
        }

        if (!isFlush) {
            sb.append("NIKAD");
        }

        System.out.println(sb);
    }
}
