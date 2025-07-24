import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] power = new int[N];
        String[] title = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            title[i] = st.nextToken();
            power[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(br.readLine());
            int left = 0;
            int right = N - 1;
            int idx = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (key <= power[mid]) {
                    right = mid - 1;
                    idx = mid;
                } else {
                    left = mid + 1;
                }
            }

            sb.append(title[left]).append("\n");
        }

        System.out.println(sb);
    }
}