import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrA = new int[N];
        Integer[] arrB = new Integer[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrB[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += arrA[i] * arrB[i];
        }

        System.out.println(result);
    }
}
