import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		if (a < 1024) {
			System.out.println("No thanks");
		} else {
			int needMoney = a - 1023;
			int borrowMoney = b;
			if ((needMoney & borrowMoney) == needMoney) {
				System.out.println("Thanks");
			} else {
				System.out.println("Impossible");
			}
		}
	}
}
