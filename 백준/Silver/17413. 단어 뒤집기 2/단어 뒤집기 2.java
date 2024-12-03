import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		String str = br.readLine();
		char[] c = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (c[i] == '<') {
				while (!stack.isEmpty())
					sb.append(stack.pop());

				while (c[i] != '>')
					sb.append(c[i++]);

				sb.append(c[i]);
			} else if (c[i] == ' ') {
				while (!stack.isEmpty())
					sb.append(stack.pop());

				sb.append(' ');
			} else {
				stack.push(c[i]);
			}

		}

		while (!stack.isEmpty())
			sb.append(stack.pop());

		System.out.println(sb);
	}
}