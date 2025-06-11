import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] streetTree = new int[N];

        for (int i = 0; i < N; i++) {
            streetTree[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < N - 1; i++) {
            int distance = streetTree[i + 1] - streetTree[i];
            gcd = findGCD(distance, gcd);
        }

        int totalSpots = (streetTree[N - 1] - streetTree[0]) / gcd + 1;
        int result = totalSpots - N;

        System.out.println(result);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
