import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String S = br.readLine();
            int n = S.length();
            int palindromeStartIndex = n;

            for (int i = 0; i < n; i++) {
                if (isPalindrome(S.substring(i))) {
                    palindromeStartIndex = i;
                    break;
                }
            }

            String prefixToAdd = S.substring(0, palindromeStartIndex);
            String reversedPrefix = new StringBuilder(prefixToAdd).reverse().toString();
            String X = S + reversedPrefix;

            sb.append(X).append("\n");
        }

        System.out.print(sb);
    }
}