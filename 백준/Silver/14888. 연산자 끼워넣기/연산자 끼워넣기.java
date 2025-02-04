import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static int[] operators;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        operators = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int result, int idx) {
        if (idx == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                int newResult = calculate(result, arr[idx], i);
                dfs(newResult, idx + 1);

                operators[i]++;
            }
        }
    }

    private static int calculate(int a, int b, int oper) {
        switch (oper) {
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            case 3: return a / b;
        }

        return 0;
    }
}