import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a1 = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= a1; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            bw.write(("Case #" + i + ": " + a2 + " + " + a3 + " = " + (a2 + a3)) + "\n");
        }
        bw.close();
    }
}
