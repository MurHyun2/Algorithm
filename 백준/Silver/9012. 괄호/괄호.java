import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());

        // N만큼 반복
        for (int i = 0; i < N; i++) {
            // 입력
            String input = br.readLine().trim();
            // PS 검증
            if (isValidPS(input)) {
                sb.append("YES\n");
                continue;
            }
            sb.append("NO\n");
        }
        // sb 출력
        System.out.println(sb);
    }

    public static boolean isValidPS(String input) {
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
        return stack.isEmpty();
    }
}
