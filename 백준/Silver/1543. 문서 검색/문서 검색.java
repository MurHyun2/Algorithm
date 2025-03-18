import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String findAlp = br.readLine();
        int result = 0;

        while (input.length() >= findAlp.length()) {
            if (input.contains(findAlp)) {
                result++;
                input = input.replaceFirst(findAlp, " ");
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}