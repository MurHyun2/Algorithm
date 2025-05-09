import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] aArr = new int[A];
        int[] bArr = new int[B];
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            int num = Integer.parseInt(st.nextToken());
            aArr[i] = num;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        int cnt = B;

        for (int i = 0; i < A; i++) {
            if(set.contains(aArr[i])) {
                cnt--;
            } else {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}