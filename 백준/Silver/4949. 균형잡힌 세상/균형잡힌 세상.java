import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) { // 종료 조건
                break;
            }

            // 균형 여부를 판단하는 메서드 호출
            sb.append(isBalanced(input) ? "yes" : "no").append("\n");
        }

        System.out.println(sb); // 최종 결과 출력
    }

    // 문자열이 균형 잡힌 괄호인지 확인하는 메서드
    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch); // 여는 괄호를 스택에 추가
            } else if (ch == ')' || ch == ']') {
                // 닫는 괄호에 대해 스택 상태 확인
                if (stack.isEmpty() || !isMatching(stack.pop(), ch)) {
                    return false; // 균형이 깨짐
                }
            }
        }

        // 스택이 비어있다면 균형 잡힘
        return stack.isEmpty();
    }

    // 여는 괄호와 닫는 괄호가 짝이 맞는지 확인하는 메서드
    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}
