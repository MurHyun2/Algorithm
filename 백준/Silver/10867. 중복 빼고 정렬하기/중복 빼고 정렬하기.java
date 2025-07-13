import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> tempSet = new ArrayList<>(set);
        Collections.sort(tempSet);

        StringBuilder sb = new StringBuilder();
        for (Integer i : tempSet) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}