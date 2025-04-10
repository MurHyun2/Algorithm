import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int importance = Integer.parseInt(st.nextToken());
                q.offer(new int[]{j, importance});
                pq.offer(importance);
            }

            int cnt = 0;

            while (!q.isEmpty()) {
                int[] cur = q.poll();

                if (cur[1] < pq.peek()) {
                    q.offer(cur);
                    continue;
                }

                pq.poll();
                cnt++;

                if (cur[0] == M) {
                    sb.append(cnt).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}