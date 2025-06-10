import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long result = 1;

        if (M <= N) {
            result = 0;

        } else {
            for (long i = N; i > 0; i--) {
                result *= i;
                result %= M;

                if (result == 0) {
                    break;
                }
            }
        }

        System.out.println(Long.toString(result));
    }
}