import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String alp = sc.nextLine();
		int time = 0;

		for (int i = 0; i < alp.length(); i++) {
			if(alp.charAt(i) < 'D') time += 3;
			else if(alp.charAt(i) < 'G') time += 4;
			else if(alp.charAt(i) < 'J') time += 5;
			else if(alp.charAt(i) < 'M') time += 6;
			else if(alp.charAt(i) < 'P') time += 7;
			else if(alp.charAt(i) < 'T') time += 8;
			else if(alp.charAt(i) < 'W') time += 9;
			else if(alp.charAt(i) <= 'Z') time += 10;
		}
		System.out.println(time);
	}
}