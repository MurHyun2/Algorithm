import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int win = 0;

        for (int i = 0; i < 6; i++) {
            String result = br.readLine();
            if (result.equals("W")) {
                win++;
            }
        }

        if (win >= 5) {
            System.out.println(1);
        } else if (win >= 3) {
            System.out.println(2);
        } else if (win >= 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}