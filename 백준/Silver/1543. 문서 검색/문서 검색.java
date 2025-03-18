import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String findAlp = br.readLine();
        int result = 0;
        int index = 0;

        while ((index = input.indexOf(findAlp, index)) != -1 ) {
            result++;
            index += findAlp.length();    
        }

        System.out.println(result);
    }
}