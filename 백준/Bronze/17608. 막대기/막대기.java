import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		Stack <Integer> stack = new Stack <Integer>();
		
		int max = 0;
		
		for (int i=0; i<N; i++) {
			stack.push(Integer.parseInt(bf.readLine()));
			if(max<stack.peek()) max=stack.peek();
		}
		
		int s = 0;
		int result = 0;

		for (int i=0; i<N; i++) {
			int p = stack.pop();
			if(s<p) { 
				s=p;
				result++;
			}
			if (p == max) break; 
		}
		
		System.out.println(result);
	}

}
