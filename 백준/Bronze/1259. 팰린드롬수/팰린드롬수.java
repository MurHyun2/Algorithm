import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) {
                break;
            }

            String reversed = new StringBuilder(input).reverse().toString();
            String result = input.equals(reversed) ? "yes" : "no";

            System.out.println(result);
        }
    }
}
