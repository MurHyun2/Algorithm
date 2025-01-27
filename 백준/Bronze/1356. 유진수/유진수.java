import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        if (input.length == 1) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < input.length - 1; i++) {
            int left = 1;
            int right = 1;

            for (int j = 0; j <= i; j++) {
                left *= input[j] - '0';
            }

            for (int j = i + 1; j < input.length; j++) {
                right *= input[j] - '0';
            }

            if (left == right) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}