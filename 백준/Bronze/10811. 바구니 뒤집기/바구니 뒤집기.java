import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		int temp = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int j = 0; j < M; j++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			while (a < b) {
				temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b--;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
}