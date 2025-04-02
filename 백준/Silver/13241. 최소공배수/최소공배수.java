import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long oriA = a;
        long oriB = b;
        long temp;

        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println((oriA / a) * oriB);
    }
}
