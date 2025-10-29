import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        String[] seqs = {"TTT","TTH","THT","THH","HTT","HTH","HHT","HHH"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < P; i++) {
            String s = br.readLine();
            int[] count = new int[8];
            
            for (int j = 0; j < 38; j++) {
                String sub = s.substring(j, j + 3);
                
                for (int k = 0; k < 8; k++) {
                    if (seqs[k].equals(sub)) {
                        count[k]++;
                        break;
                    }
                }
            }
            
            for (int k = 0; k < 8; k++) {
                sb.append(count[k]);
                if (k != 7) sb.append(' ');
            }
            
            sb.append('\n');
        }
        
        System.out.print(sb);
    }
}
