import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken()), stress = 0;
        int ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            stress += Integer.parseInt(st.nextToken());
            if (stress < 0) stress = 0;
            if (stress >= M) ans++;
        }

        System.out.print(ans);
    }
}