import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (b % 10) * a;
		int d = ((b / 10) % 10) * a;
		int e = ((b / 100) % 10) * a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a * b);
	}
}