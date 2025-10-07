import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        while (true) {
            B += A;
            if (B >= 5) {
                System.out.println("yt");
                break;
            }
            A += B;
            if (A >= 5) {
                System.out.println("yj");
                break;
            }
        }
    }
}
