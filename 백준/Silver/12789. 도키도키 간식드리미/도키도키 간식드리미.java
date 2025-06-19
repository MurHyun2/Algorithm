import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> line = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            line.add(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> stack = new Stack<>();
        int expected = 1;

        while (true) {
            if (!line.isEmpty() && line.peek() == expected) {
                line.poll();
                expected++;
            } else if (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            } else if (!line.isEmpty()) {
                stack.push(line.poll());
            } else {
                break;
            }
        }


        System.out.println(expected == N + 1 ? "Nice" : "Sad");
    }
}