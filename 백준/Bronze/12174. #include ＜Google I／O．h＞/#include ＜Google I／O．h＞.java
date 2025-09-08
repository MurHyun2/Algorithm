import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= T; i++) {
            int B = Integer.parseInt(br.readLine());
            String line = br.readLine();
            StringBuilder result = new StringBuilder();
            
            for (int j = 0; j < B; j++) {
                String byteString = line.substring(j * 8, (j + 1) * 8);
                String binaryString = byteString.replace('I', '1').replace('O', '0');
                int asciiValue = Integer.parseInt(binaryString, 2);
                
                result.append((char) asciiValue);
            }
            
            System.out.println("Case #" + i + ": " + result.toString());
        }
    }
    
}
