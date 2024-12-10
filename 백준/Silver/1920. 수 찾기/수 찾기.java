import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = Integer.parseInt(br.readLine().trim());
        HashSet<Integer> set = new HashSet<>(N);
        st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine().trim());

        // 수 찾기
        for (int i = 0; i < M; i++) {
            sb.append(set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");
        }

        System.out.println(sb);
    }
}
