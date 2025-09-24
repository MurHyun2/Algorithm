import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] zeroMemo = new int[41];
        int[] oneMemo = new int[41];
        
        zeroMemo[0] = 1; oneMemo[0] = 0;
        zeroMemo[1] = 0; oneMemo[1] = 1;
        
        for(int i = 2; i < 41; i++) {
            zeroMemo[i] = zeroMemo[i - 1] + zeroMemo[i - 2];
            oneMemo[i] = oneMemo[i - 1] + oneMemo[i - 2];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            sb.append(zeroMemo[x]).append(" ").append(oneMemo[x]).append("\n");
        }
        
        System.out.println(sb);
    }
}