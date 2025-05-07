import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String status = st.nextToken();

            if (status.equals("leave")) {
                set.remove(person);
                continue;
            }

            set.add(person);
        }

        set.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}