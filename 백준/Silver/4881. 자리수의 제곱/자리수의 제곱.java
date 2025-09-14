import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }

            Map<Integer, Integer> aMap = buildMap(a);
            Map<Integer, Integer> bMap = buildMap(b);

            int best = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> e : aMap.entrySet()) {
                int key = e.getKey();
                if (bMap.containsKey(key)) {
                    int sum = e.getValue() + bMap.get(key);
                    if (sum < best) {
                        best = sum;
                    }
                }
            }

            if (best == Integer.MAX_VALUE) {
                best = 0;
            }

            sb.append(a).append(" ").append(b).append(" ").append(best).append('\n');
        }

        System.out.println(sb);
    }

    private static int next(int x) {
        int sum = 0;
        while (x > 0) {
            int d = x % 10;
            sum += d * d;
            x /= 10;
        }

        return sum;
    }

    private static Map<Integer, Integer> buildMap(int start) {
        Map<Integer, Integer> map = new HashMap<>();
        int cur = start;
        int step = 1;
        map.put(cur, step);

        while (true) {
            int nx = next(cur);
            step++;
            if (map.containsKey(nx)) {
                break;
            }
            map.put(nx, step);
            cur = nx;
        }

        return map;
    }

}