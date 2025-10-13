import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
	static int a, b, gcd;

	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
        
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		a = (a1 * b2) + (a2 * b1);
		b = b1 * b2;
		
		gcd = getGCD(a, b);
        
		System.out.println((a / gcd) + " " + (b / gcd));
	}

	public static int getGCD(int p, int q) {
		if (q == 0) {
			return p;
		}
        
		return getGCD(q, p % q);
	}

}