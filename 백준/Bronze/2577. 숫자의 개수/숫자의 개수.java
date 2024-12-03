import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		
		for (int i = 0; i < 3; i++) {
			int a = (Integer.parseInt(br.readLine()));
			num *= a;
		}
		
		String result = Integer.toString(num);

		for (int i = 0; i < 10; i++) {
			char ch = Character.forDigit(i, 10);
			int b = 0;
			b = (int) result.chars().filter(c -> c == ch).count();
			
			System.out.println(b);
		}
	}
}
