import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int P = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= P; i++) {
            int[] arr = new int[20];

            st = new StringTokenizer(br.readLine());
            st.nextToken();

            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;

            for (int j = 1; j < 20; j++) {
                int key = arr[j];
                int k = j - 1;

                while (k >= 0 && arr[k] > key) {
                    arr[k + 1] = arr[k];
                    k--;
                    cnt++;
                }

                arr[k + 1] = key;
            }

            sb.append(i).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}