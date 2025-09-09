import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {
            String bookName = br.readLine();
            int cnt = map.getOrDefault(bookName, 0) + 1;
            map.put(bookName, cnt);

            if (cnt > max) {
                max = cnt;
                ans = bookName;
            } else if (cnt == max && bookName.compareTo(ans) < 0) {
                ans = bookName;
            }
        }

        System.out.println(ans);
    }
    
}