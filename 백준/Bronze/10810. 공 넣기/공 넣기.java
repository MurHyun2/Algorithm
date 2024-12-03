import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < b; i++) {
			int startNum = sc.nextInt();
			int endNum = sc.nextInt();
			int setNum = sc.nextInt();

			for (int j = startNum; j <= endNum; j++) {
				arr[j-1] = setNum;
			}
		}
		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}
