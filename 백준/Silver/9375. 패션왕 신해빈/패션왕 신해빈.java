import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Set<String>> map = new HashMap<>();

            for (int j = 0; j < N; j++) {
                String[] str = br.readLine().split(" ");
                map.putIfAbsent(str[1], new HashSet<>());
                map.get(str[1]).add(str[0]);
            }

            int result = 1;

            for (Set<String> items : map.values()) {
                result *= (items.size() + 1);
            }

            sb.append(result - 1).append("\n");
        }

        System.out.println(sb);
    }
}