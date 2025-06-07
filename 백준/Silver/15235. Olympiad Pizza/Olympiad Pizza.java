import java.io.*;
import java.util.*;

public class Main {
    static class Contestant {
        int index;
        int remaining;

        Contestant(int index, int remaining) {
            this.index = index;
            this.remaining = remaining;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] result = new int[N];
        Queue<Contestant> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int slices = Integer.parseInt(st.nextToken());
            queue.offer(new Contestant(i, slices));
        }

        int time = 1;
        while (!queue.isEmpty()) {
            Contestant current = queue.poll();
            current.remaining--;
            
            if (current.remaining == 0) {
                result[current.index] = time;
            } else {
                queue.offer(current);
            }
            time++;
        }

        StringBuilder sb = new StringBuilder();
        for (int t : result) {
            sb.append(t).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
