import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int[] prefix = new int[N + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + arr[i + 1];
        }
        
        int M = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());          
            int sum = prefix[end] - prefix[start - 1];
                
            sb.append(sum).append("\n");
        }
        
        System.out.println(sb);
    }
}