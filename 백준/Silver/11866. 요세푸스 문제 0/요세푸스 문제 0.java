import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 큐 초기화 (1부터 N까지 추가)
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 요세푸스 순열 생성
        while (!q.isEmpty()) {
            for (int i = 1; i < K; i++) { // K-1번 순환
                q.offer(q.poll());
            }
            sb.append(q.poll()); // K번째 사람 제거

            if (!q.isEmpty()) {
                sb.append(", "); // 마지막이 아니라면 쉼표 추가
            }
        }

        sb.append(">");

        // 결과 출력
        System.out.println(sb);
    }
}
