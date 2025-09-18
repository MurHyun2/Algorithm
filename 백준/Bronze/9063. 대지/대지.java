import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
        
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.println((A[N - 1] - A[0]) * (B[N - 1] - B[0]));
	}

}