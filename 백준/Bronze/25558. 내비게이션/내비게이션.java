import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        long sx = Long.parseLong(st.nextToken());
        long sy = Long.parseLong(st.nextToken());
        long ex = Long.parseLong(st.nextToken());
        long ey = Long.parseLong(st.nextToken());

        long minDistance = Long.MAX_VALUE;
        int minIndex = 0;

        for (int i = 1; i <= n; i++) {
            long result = 0;
            long curX = sx;
            long curY = sy;

            int m = Integer.parseInt(br.readLine());

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                long nextX = Long.parseLong(st.nextToken());
                long nextY = Long.parseLong(st.nextToken());

                result += Math.abs(curX - nextX) + Math.abs(curY - nextY);
                curX = nextX;
                curY = nextY;
            }

            result += Math.abs(curX - ex) + Math.abs(curY - ey);

            if (result < minDistance) {
                minDistance = result;
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}