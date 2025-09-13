import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] words = new String[n];
        int totalWordLength = 0;

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
            totalWordLength += words[i].length();
        }

        int totalUnderscores = m - totalWordLength;
        int gap = n - 1;
        int baseUnderscoresPerGap = totalUnderscores / gap;
        int extraUnderscores = totalUnderscores % gap;

        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);

        for (int i = 1; i < n; i++) {
            String currentWord = words[i];

            for (int j = 0; j < baseUnderscoresPerGap; j++) {
                sb.append("_");
            }

            if(extraUnderscores > 0 && Character.isLowerCase(currentWord.charAt(0))) {
                sb.append("_");
                extraUnderscores--;
            } else if (extraUnderscores > gap - i) {
                sb.append("_");
                extraUnderscores--;
            }

            sb.append(currentWord);
        }

        System.out.println(sb);
    }

}