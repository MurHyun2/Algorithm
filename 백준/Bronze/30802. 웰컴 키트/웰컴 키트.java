import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tCount = 0;
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        // 입력 끝

        for (int i = 0; i < 6; i++) {
            if(arr[i] - T > 0) {
                tCount += (arr[i] / T);

                if(arr[i] % T != 0) {
                    tCount++;
                }
            } else if ((arr[i]!= 0)) {
                tCount++;
            }
        }

        System.out.println(tCount);
        System.out.println(N / P + " " + N % P);
    }
}