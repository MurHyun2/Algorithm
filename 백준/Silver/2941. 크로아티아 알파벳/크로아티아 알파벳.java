import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] croAlp = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		String input = br.readLine().trim();
		for (int i = 0; i < croAlp.length; i++) {
				input = input.replaceAll(croAlp[i], "1");
			}
		
		System.out.println(input.length());
	}
}
