import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		String a = "";
		String b = "";
		
		for (int i = 2; i >= 0; i--) {
			a += A.charAt(i);
			b += B.charAt(i);
		}
		if (Integer.parseInt(a) > Integer.parseInt(b)) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
