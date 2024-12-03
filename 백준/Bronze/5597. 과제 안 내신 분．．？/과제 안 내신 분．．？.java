import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp;
		
		for (int i = 0; i < 30; i++) {
			arr.add(i, i + 1);
		}
		
		for (int j = 0; j < 28; j++) {
			arr.remove(Integer.valueOf(sc.nextInt()));
		}
		if(arr.get(0) > arr.get(1)) {
			temp = arr.get(0);
			arr.set(0, arr.get(1));
			arr.set(1, temp);
		}
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}