import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 숫자의 개수 N 입력
        int N = Integer.parseInt(br.readLine().trim());
        HashMap<Integer, Integer> map = new HashMap<>();

        // N개의 숫자 입력 및 카운트
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 숫자의 개수를 확인할 M 입력
        int M = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine().trim());

        // M개의 숫자에 대한 결과 생성
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
