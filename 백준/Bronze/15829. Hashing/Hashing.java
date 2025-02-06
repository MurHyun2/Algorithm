import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long result = 0;
        long pow = 1;
        final int M = 1234567891;
        final int R = 31;

        for (int i = 0; i < L; i++) {
            result = (result + (input.charAt(i) - 'a' + 1) * pow) % M;
            pow = (pow * R) % M;
        }

        System.out.println(result);
    }
}