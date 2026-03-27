import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());

        double answer = 100.0 * X / (100 - X);

        System.out.printf("%.6f%n", answer);
    }
}