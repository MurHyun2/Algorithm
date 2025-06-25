import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            long sqrt = (long) Math.sqrt(N);
            if (sqrt * sqrt == N) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}