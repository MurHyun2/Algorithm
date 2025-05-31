import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long result = 1;
        int pre = 1;
        
        for (int i = N - 2; i >= 0; i--) {
            if(pre < arr[i]) {
                pre++;
            }
            
            else if(pre > arr[i]){
                pre = arr[i];
            }
            
            result += pre;
        }

        System.out.println(result);
    }
}