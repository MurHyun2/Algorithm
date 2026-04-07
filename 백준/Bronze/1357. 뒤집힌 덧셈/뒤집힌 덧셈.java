import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int rev(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int result = rev(rev(x) + rev(y));
        System.out.println(result);
    }
}