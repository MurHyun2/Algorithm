import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int A = Math.abs(o1);
            int B = Math.abs(o2);

            if (A == B) {
                return o1 - o2;
            }

            return A - B;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append("0");
                } else {
                    sb.append(pq.poll());
                }

                sb.append("\n");
                continue;
            }

            pq.offer(num);
        }

        System.out.println(sb);
    }
}