import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxLength = 0;
        List<Integer> longestSequence = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            
            List<Integer> sequence = new ArrayList<>();
            int a = n;
            int b = i;
            sequence.add(a);
            sequence.add(b);

            while (true) {
                int next = a - b;

                if (next < 0) {
                    break;
                }
                
                sequence.add(next);
                a = b;
                b = next;
            }

            if (sequence.size() > maxLength) {
                maxLength = sequence.size();
                longestSequence = sequence;
            }
        }

        System.out.println(maxLength);
        
        StringBuilder sb = new StringBuilder();
        for (int num : longestSequence) {
            sb.append(num).append(" ");
        }
        
        System.out.println(sb);
    }
}