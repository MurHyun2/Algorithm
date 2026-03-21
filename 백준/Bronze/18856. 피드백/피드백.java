import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(N).append('\n');

        for (int i = 1; i < N; i++) {
            sb.append(i).append(' ');
        }
        
        sb.append(997);

        System.out.print(sb);
    }
}