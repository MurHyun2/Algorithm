import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            int cnt = 0;
            for (int j = 0; j <= 9; j++) {
                if (str.contains(String.valueOf(j))) {
                    str.replaceAll(String.valueOf(j), "");
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}