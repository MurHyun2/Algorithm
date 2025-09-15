import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long cardNum = Long.parseLong(br.readLine());
            map.merge(cardNum, 1, Integer::sum);
        }

        int maxCnt = 0;
        long minValue = Long.MAX_VALUE;

        for (Map.Entry<Long, Integer> e : map.entrySet()) {
            int cnt = e.getValue();
            long num = e.getKey();

            if (cnt > maxCnt || (cnt == maxCnt && num < minValue)) {
                maxCnt = cnt;
                minValue = num;
            }
        }

        System.out.println(minValue);
    }

}