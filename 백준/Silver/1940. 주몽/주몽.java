import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        boolean[] usedMaterials = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (!usedMaterials[i] && !usedMaterials[j]) {
                    if(arr[i] + arr[j] == M) {
                        usedMaterials[i] = true;
                        usedMaterials[j] = true;
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}