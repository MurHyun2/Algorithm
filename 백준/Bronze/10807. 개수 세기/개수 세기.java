import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int input = 0;
		int ans = 0;
		
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		input = sc.nextInt();
		
		for (int result : arr) {
			if(input == result) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}
}
