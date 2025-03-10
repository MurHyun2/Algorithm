import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] prefix = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int max = 0;
        int cnt = 0;
        
        for (int i = X; i <= N; i++) {
            int sum = prefix[i] - prefix[i - X];
            if(sum > max) {
                max = sum;
                cnt = 1;
            } else if(sum == max) {
                cnt++;
            }
        }

        if(max == 0) {
            System.out.println("SAD");
            return;
        }

        System.out.printf("%d\n%d", max, cnt);
    }
}
