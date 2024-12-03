import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String str = sc.nextLine();
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(str.substring(i, i + 1));
			result += a;
		}
		System.out.println(result);
	}
}
