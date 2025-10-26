import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            sb.append(s.replace("PO", "PHO")).append('\n');
        }
        
        System.out.print(sb);
    }
}
