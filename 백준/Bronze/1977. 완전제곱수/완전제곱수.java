import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int start = (int) Math.ceil(Math.sqrt(M));
        int end = (int) Math.floor(Math.sqrt(N));

        if (start > end) {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        int min = start * start;

        for (int i = start; i <= end; i++) {
            sum += i * i;
        }

        System.out.println(sum);
        System.out.println(min);
    }
}