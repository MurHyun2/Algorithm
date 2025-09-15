import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long cardNum = Long.parseLong(br.readLine());
            if (map.containsKey(cardNum)) {
                map.put(cardNum, map.get(cardNum) + 1);
                continue;
            }
            map.put(cardNum, 1);
        }

        int maxCnt = 0;

        for (Map.Entry<Long, Integer> e : map.entrySet()) {
            if (maxCnt <= e.getValue()) {
                maxCnt = e.getValue();
            }
        }
        
        long minValue = Long.MAX_VALUE;

        for (Map.Entry<Long, Integer> e : map.entrySet()) {
            if (e.getValue() == maxCnt) {
                minValue = Math.min(minValue, e.getKey());
            }
        }

        System.out.println(minValue);
    }
    
}