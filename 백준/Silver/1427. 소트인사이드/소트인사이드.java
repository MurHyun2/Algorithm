import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        Arrays.sort(input);

        StringBuilder sb = new StringBuilder();
        for (int i = input.length - 1; i >= 0; i--) {
            sb.append(input[i]);
        }

        System.out.println(sb);
    }
}