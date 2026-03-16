import java.io.*;
import java.util.*;

public class Main {
    static boolean matches(String acronym, String phrase) {
        String[] words = phrase.split(" ");
        if (words.length != acronym.length()) return false;

        for (int i = 0; i < acronym.length(); i++) {
            if (words[i].charAt(0) != acronym.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String acronym = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            sb.append(acronym).append('\n');

            for (int i = 0; i < n; i++) {
                String phrase = br.readLine();
                if (matches(acronym, phrase)) {
                    sb.append(phrase).append('\n');
                }
            }
        }

        System.out.print(sb);
    }
}