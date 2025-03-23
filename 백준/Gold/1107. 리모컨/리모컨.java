import java.io.*;

public class Main {

    static int N, M;
    static boolean[] brokenBtn;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        brokenBtn = new boolean[10];

        if (M != 0) {
            String[] input = br.readLine().split(" ");

            for (int i = 0; i < M; i++) {
                brokenBtn[input[i].charAt(0) - '0'] = true;
            }
        }

        int result = findMinPressCount();

        System.out.println(result);
    }

    private static int findMinPressCount() {
        int result = Math.abs(N - 100);

        for (int i = 0; i <= 999_999; i++) {
            String num = Integer.toString(i);
            boolean isBroken = false;

            for (int j = 0; j < num.length(); j++) {
                int nowNum = num.charAt(j) - '0';

                if (brokenBtn[nowNum]) {
                    isBroken = true;
                    break;
                }
            }

            if (!isBroken) {
                int cnt = Math.abs(N - i) + num.length();
                result = Math.min(cnt, result);
            }
        }
        return result;
    }
}