import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int hcal = (m + c) / 60;
		int mcal = (m + c) % 60;
		
		if (hcal == 0) {
			System.out.println(h + " " + mcal);
		} else {
			if (h + hcal >= 24) {
				h = h + hcal - 24;
				System.out.println(h + " " + mcal);
			} else {
				System.out.println(h + hcal + " " + mcal);
			}
		}
	}
}