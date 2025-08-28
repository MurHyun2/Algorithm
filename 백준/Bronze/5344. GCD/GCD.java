import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            
            while (line != null && line.trim().isEmpty()) line = br.readLine();
            
            StringTokenizer st = new StringTokenizer(line);
            
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            
            sb.append(gcd(a, b)).append('\n');
        }
        
        System.out.print(sb.toString());
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
    
}
