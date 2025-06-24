import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int[] count = new int[26];
            
            for (char c : s.toCharArray()) count[c - 'a']++;
            
            int distinct = 0;
            
            for (int c : count) if (c > 0) distinct++;
            
            int erase = 0;
            
            if (distinct > 2) {
                Arrays.sort(count);
                
                for (int j = 0; j < 26 - 2; j++) erase += count[j];
            }
            
            System.out.println(erase);
        }
    }
}
