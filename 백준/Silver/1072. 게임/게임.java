import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());

        long winRate = (Y * 100) / X;

        if (winRate >= 99) {
            System.out.println(-1);
            return;
        }

        long left = 0;
        long right = 1_000_000_000;
        long result = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long newY = Y + mid;
            long newX = X + mid;
            long newWinRate = (newY * 100) / newX;

            if (newWinRate > winRate) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }
}