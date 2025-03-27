import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            List<Integer> divisors = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            if (sum != n) {
                sb.append(n).append(" is NOT perfect.\n");
            } else {
                sb.append(n).append(" = ").append(divisors.get(0));
                for (int i = 1; i < divisors.size(); i++) {
                    sb.append(" + ").append(divisors.get(i));
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}