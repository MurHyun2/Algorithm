import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int target = Integer.parseInt(br.readLine());
            if (target == 0) {
                break;
            }
            
            int low = 1;
            int high = 50;
            StringBuilder sb = new StringBuilder();
            
            while (true) {
                int guess = (low + high) / 2;
                
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(guess);
                
                if (guess == target) {
                    break;
                } else if (guess < target) {
                    low = guess + 1;
                } else {
                    high = guess - 1;
                }
            }
            System.out.println(sb);
        }
    }
}