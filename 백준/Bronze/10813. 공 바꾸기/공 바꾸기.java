import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < b; i++) {
			int firstNum = sc.nextInt() - 1;
			int nextNum = sc.nextInt() - 1;
			int arr1 = arr[firstNum];
			int arr2 = arr[nextNum];
			
			arr[firstNum] = arr2;
			arr[nextNum] = arr1;
		}
		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}
