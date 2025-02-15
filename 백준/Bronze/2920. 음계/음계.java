import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] list = new int[8];
		String result = "";

		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		for (int j = 0; j < list.length - 1; j++) {
			if (list[j] + 1 == list[j + 1])
				result = "ascending";
			else if (list[j] - 1 == list[j + 1])
				result = "descending";
			else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
}
