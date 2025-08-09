import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] UCPC = new char[4];
        UCPC[0] = 'U';
        UCPC[1] = 'C';
        UCPC[2] = 'P';
        UCPC[3] = 'C';

        int idx = 0;

        while (st.hasMoreTokens()) {
            char ch[] = st.nextToken().toCharArray();

            for (char c : ch) {
                if (c == (UCPC[idx])) {

                    if (idx == 3) {
                        System.out.println("I love UCPC");
                        return;
                    }

                    idx++;
                }
            }
        }

        System.out.println("I hate UCPC");
    }
}