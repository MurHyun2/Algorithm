import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String target = "SciComLove";
        int diff = 0;

        for (int i = 0; i < 10; i++) {
            if (input.charAt(i) != target.charAt(i)) {
                diff++;
            }
        }

        System.out.println(diff);
    }
}