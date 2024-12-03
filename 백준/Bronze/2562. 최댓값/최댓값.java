import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		int max = Collections.max(arr);
		System.out.println(max);
		System.out.println(arr.indexOf(max) + 1);
	}
}
