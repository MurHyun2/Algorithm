import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char prev = 0;

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != prev) {
                sb.append(c);
                prev = c;
            }
        }

        System.out.println(sb.toString());
    }
}