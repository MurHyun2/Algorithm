import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int result : arr) {
			if(result < n) {
				al.add(result);
			}
		}
		
		for (Integer integer : al) {
			System.out.print(integer + " ");
		}
	}
}