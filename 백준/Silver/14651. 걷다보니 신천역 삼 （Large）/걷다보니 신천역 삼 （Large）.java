import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static BigInteger MOD = new BigInteger("1000000009");

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println("0");
            return;
        }

        BigInteger ans = new BigInteger("2");
        for (int i = 0; i < N - 2; i++) {
            ans = ans.multiply(new BigInteger("3"));
        }

        System.out.println(ans.mod(MOD));
    }
}