import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a % 10 == 0) {
                sb.append(10).append("\n");
                continue;
            }
            
            int num = a % 10;
            
            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }
            
            sb.append(num).append("\n");
        }
        
        System.out.print(sb);
    }
}