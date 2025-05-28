import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int digit = String.valueOf(N).length();
        int count = 0;
        
        while (true) {
            N *= 2;
            if (String.valueOf(N).length() > digit) {
              break;  
            }
            count++;
        }
        
        System.out.println(count);
    }
}