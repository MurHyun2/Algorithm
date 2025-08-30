import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int first = Integer.parseInt(br.readLine().trim());
        int min = first, max = first;
        
        for (int i = 1; i < N; i++) {
            int x = Integer.parseInt(br.readLine().trim());
            if (x < min) min = x;
            if (x > max) max = x;
        }
        
        if (first == min) System.out.print("ez");
        else if (first == max) System.out.print("hard");
        else System.out.print("?");
    }
    
}
