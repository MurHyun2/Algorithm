import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 1;
        int sum = 1;
        int cnt = 0;

        while (end <= N) {
            if (sum < N) {
                sum += ++end;
            } else if (sum > N) {
                sum -= start++;
            } else {
                sum += ++end;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}