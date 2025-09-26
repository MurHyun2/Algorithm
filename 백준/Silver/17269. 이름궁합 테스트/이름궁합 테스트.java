import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alp = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] a = st.nextToken().toCharArray();
        char[] b = st.nextToken().toCharArray();
        int[] arr = new int[n + m];

        int idx = 0, ai = 0, bi = 0;
        while (ai < n || bi < m) {
            if (ai < n) arr[idx++] = alp[a[ai++] - 'A'];
            if (bi < m) arr[idx++] = alp[b[bi++] - 'A'];
        }

        int len = n + m;

        while (len > 2) {
            for(int i = 0; i < len - 1; i++) {
                arr[i] = (arr[i] + arr[i + 1]) % 10;
            }

            len--;
        }

        System.out.println(arr[0] * 10 + arr[1] + "%");
    }
}