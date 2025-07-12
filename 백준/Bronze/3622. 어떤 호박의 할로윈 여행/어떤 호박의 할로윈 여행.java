import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        boolean canMake = false;

        if (A + B <= P) {
            canMake = true;
        } else if (a >= B && P >= A) {
            canMake = true;
        } else if (b >= A && P >= B) {
            canMake = true;
        }

        System.out.println(canMake ? "Yes" : "No");
    }
}
