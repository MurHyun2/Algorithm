import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] digitSum = new int[N + 1];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            digitSum[i] = digitSum[i / 10] + (i % 10);

            if (i % digitSum[i] == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}