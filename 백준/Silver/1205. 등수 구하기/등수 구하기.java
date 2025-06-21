import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        if (n > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, Collections.reverseOrder());

        if (n == p && n > 0 && newScore <= arr[arr.length - 1]) {
            System.out.print(-1);
        } else {
            int rank = 1;
            
            for (int i = 0; i < arr.length; i++) {
                if (newScore < arr[i]) rank++;
                else break;
            }
            
            System.out.print(rank);
        }
    }
}
