import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());

        long[] delta = new long[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            delta[i] = (long)A * X - (long)B * Y;
        }

        Arrays.sort(delta);
        
        long totalDelta = 0;
        
        for (int i = 0; i < M; i++) {
            totalDelta += delta[i];
        }

        long result = K * (X + Y) + totalDelta;
        
        System.out.println(result);
    }
}
