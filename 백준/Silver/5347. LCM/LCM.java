import java.util.Scanner;

public class Main {
  
	public static long gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static long lcm(int a, int b) {
		return Math.abs((long) a * b) / gcd(a, b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] inputs = sc.nextLine().split("\\s+");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            System.out.println(lcm(a, b));
        }
	}
}
