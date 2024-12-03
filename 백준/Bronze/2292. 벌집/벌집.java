import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = (int) Long.parseLong(st.nextToken());
		int count = 1;
		int num = 1;
		int add = 0;

		while (true) {
			if (N <= num) {
				System.out.println(count);
				break;
			}
			add += 6;
			num += add;
			count++;
		}
    }
}
