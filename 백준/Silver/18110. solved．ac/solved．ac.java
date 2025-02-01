import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if( N == 0 ) {
            System.out.println(0);
            return;
        }

        int[] inputs = new int[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(inputs);

        int avg = (int) Math.round(N * 0.15);
        double sum = 0;

        for (int i = avg; i < N - avg; i++) {
            sum += inputs[i];
        }

        System.out.println(Math.round(sum / (N - (avg * 2))));
    }
}