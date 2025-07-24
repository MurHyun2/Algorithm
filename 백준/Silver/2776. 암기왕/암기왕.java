import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int N, M;
    public static int[]  arrN, arrM;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            N = Integer.parseInt(br.readLine());
            arrN = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arrN[j] = Integer.parseInt(st.nextToken());
            }

            M = Integer.parseInt(br.readLine());
            arrM = new int[M];
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arrM[j] = Integer.parseInt(st.nextToken());
            }
            // 입력 끝

            Arrays.sort(arrN);

            for (int j = 0; j < M; j++) {
                String result =binarySearch(arrM[j]);
                sb.append(result).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static String binarySearch(int key) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (key < arrN[mid]) {
                right = mid - 1;
            } else if (key > arrN[mid]) {
                left = mid + 1;
            } else {
                return "1";
            }
        }

        return "0";
    }
}