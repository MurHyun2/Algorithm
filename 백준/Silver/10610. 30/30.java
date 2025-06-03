import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);

        if (arr[0] != '0') {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        for (char c : arr) {
            sum += c - '0';
        }
        
        if (sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        System.out.println(sb);
    }
}
