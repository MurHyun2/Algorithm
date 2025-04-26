import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = -1;

        for (int i = N / 5; i >= 0; i--) {
            if ((N - (5 * i)) % 2 == 0) {
                ans = ((N - (5 * i)) / 2) + i;
                break;
            }
        }

        System.out.println(ans);
    }
}