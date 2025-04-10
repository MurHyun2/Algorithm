import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static int N;
    static Stack<Character> stack = new Stack<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {

            stack.clear();
            visited = new boolean[26];
            char[] input = br.readLine().toCharArray();

            for (char c : input) {
                int now = c - 'a';

                if (!visited[now]) {
                    visited[now] = true;
                } else if (c != stack.peek()) {
                    break;
                }

                stack.add(c);
            }

            if (stack.size() == input.length) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}