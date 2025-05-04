import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (!pq.isEmpty()) {
                    sb.append(pq.poll());
                } else {
                    sb.append("0");
                }
                sb.append("\n");
                continue;
            }

            pq.offer(num);
        }

        System.out.println(sb);
    }
}