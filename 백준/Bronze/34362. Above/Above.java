import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double N = Double.parseDouble(br.readLine());
        double result = N - 0.3;

        System.out.printf("%.4f", result);
    }
}
