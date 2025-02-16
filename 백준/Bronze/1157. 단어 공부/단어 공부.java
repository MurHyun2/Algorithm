import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toLowerCase().toCharArray();
        int[] arr = new int[26];

        for (char ch : input) {
            arr[ch - 'a']++;
        }


        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max && i != idx) {
                System.out.println("?");
                break;
            }

            if (i == 25) {
                System.out.println((char) ('A' + idx));
            }
        }
    }
}
