import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            list.sort(Collections.reverseOrder());

            sb.append(list.get(2)).append("\n");
        }

        System.out.println(sb);
    }
    
}