import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        while (!input.equals("#")) {
            char[] inputArr = input.toCharArray();
            int cnt = 0;

            for (char c : inputArr) {
                for (char c1 : arr) {
                    if (Character.toLowerCase(c) == c1) {
                        cnt++;
                        break;
                    }
                }
            }
            sb.append(cnt).append("\n");
            input = br.readLine();
        }

        System.out.println(sb);
    }
}