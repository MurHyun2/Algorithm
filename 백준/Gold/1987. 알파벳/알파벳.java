import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int R, C, max;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[][] arr;
    static boolean[] usedAlphabet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[R][C];
        usedAlphabet = new boolean[26];

        for (int i = 0; i < R; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        max = 0;
        usedAlphabet[arr[0][0] - 'A'] = true;
        dfs(0, 0, 1);

        System.out.println(max);
    }

    private static void dfs(int x, int y, int depth) {
        max = Math.max(max, depth);

        for (int k = 0; k < 4; k++) {
            int nr = x + dr[k];
            int nc = y + dc[k];

            if (nr < 0 || nc < 0 || nr >= R || nc >= C || usedAlphabet[arr[nr][nc] - 'A']) {
                continue;
            }

            usedAlphabet[arr[nr][nc] - 'A'] = true;
            dfs(nr, nc, depth + 1);
            usedAlphabet[arr[nr][nc] - 'A'] = false;
        }
    }
}