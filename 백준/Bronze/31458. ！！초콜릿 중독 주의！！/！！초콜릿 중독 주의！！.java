import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String input = br.readLine().strip();
			boolean n = input.endsWith("!")?true:input.charAt(input.length()-1) == '1';
			int idx = 0;
            
			while (input.charAt(idx++) == '!') n = !n;
			sb.append(n==true?1:0).append("\n");
		}

		System.out.println(sb);
		br.close();
	}
}