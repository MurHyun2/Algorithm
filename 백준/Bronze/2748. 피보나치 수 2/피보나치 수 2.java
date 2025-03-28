import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	static long[] arr;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new long[N + 1];
 
		for(int i = 0; i < N + 1; i++) {
			arr[i] = -1;
		}
        
		arr[0] = 0;
		arr[1] = 1;
        long result = fibo(N);
        
		System.out.println(result);
	}
	
	public static long fibo(int N) {
		if(arr[N] == -1) {
			arr[N] = fibo(N - 1) + fibo(N - 2);
		}
		return arr[N];
	}
}
 