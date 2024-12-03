import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		double result = 0;
		
		for (int j = 0; j < arr.length; j++) {
			result += (double)arr[j] / max * 100;;
		}
		System.out.println(result / arr.length);
	}
}