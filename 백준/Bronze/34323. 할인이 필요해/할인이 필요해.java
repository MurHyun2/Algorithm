import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());
        
        long discount1 = (M + 1) * S * (100 - N) / 100;
        long discount2 = M * S;
        
        System.out.println(Math.min(discount1, discount2));
    }
}