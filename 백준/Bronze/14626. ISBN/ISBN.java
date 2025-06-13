import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int starIndex = 0;           
        int checksum = 0;            

        for (int i = 0; i < 13; i++) {
            char ch = input.charAt(i);
            
            if (ch == '*') {
                starIndex = i;
            } else {
                int digit = ch - '0';
                checksum += (i % 2 == 0) ? digit : digit * 3;
            }
        }

        int missingDigit = 0;
        for (int i = 0; i < 10; i++) {
            int tempSum = checksum + ((starIndex % 2 == 0) ? i : i * 3);
            
            if (tempSum % 10 == 0) {
                missingDigit = i;
                break;
            }
        }

        bw.write(String.valueOf(missingDigit));
        bw.flush();
    }
}
