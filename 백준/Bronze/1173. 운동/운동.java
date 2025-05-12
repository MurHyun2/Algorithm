import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if (M - m < T) {
            System.out.println(-1);
            return;
        }

        int cur = m;
        int time = 0;
        int done = 0;

        while (done < N) {
            
            if (cur + T <= M) {
                cur += T;
                done++;
            } else {
                cur = Math.max(cur - R, m);
            }
            
            time++;
        }

        System.out.println(time);
    }
}