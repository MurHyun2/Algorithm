import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (name.charAt(0) == 'C') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
