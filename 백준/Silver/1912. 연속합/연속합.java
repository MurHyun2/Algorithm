import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] prefix = new int[N + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            prefix[i + 1] = Math.max(arr[i], prefix[i] + arr[i]);
            max = Math.max(max, prefix[i + 1]);
        }
        
        System.out.println(max);
    }
}