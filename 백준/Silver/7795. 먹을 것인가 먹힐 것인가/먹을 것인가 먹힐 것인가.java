import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int[] aArr = new int[A];
            int[] bArr = new int[B];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < A; j++) {
                aArr[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B; j++) {
                bArr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(aArr);
            Arrays.sort(bArr);

            int sum = 0;
            int idx = 0;
            
            for (int j = 0; j < A; j++) {
                while (idx < B && aArr[j] > bArr[idx]) {
                    idx++;
                }

                sum += idx;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}