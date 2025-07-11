import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i <  T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A * B / gcd(A, B) +"\n");
        }

        bw.flush();
    }

    static int gcd(int A, int B){
        
        while(B != 0){ 
            int R = A % B;
            A = B;
            B = R; 
        }
        
        return A;
    }
}