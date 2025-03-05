import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] prefix = new int[N + 1];
        
        // 배열 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 누적합 배열
        for(int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = K; i < N + 1; i++) {
            max = Math.max(max, prefix[i] - prefix[i - K]);
        }
        
        System.out.println(max);
    }
}