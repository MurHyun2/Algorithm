import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][M];

        // 입력
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        // 최소횟수 계산
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, getRepaintCount(map, i, j));
            }
        }

        System.out.println(min);
    }

    private static int getRepaintCount(char[][] map, int x, int y) {
        int count1 = 0; // W 시작
        int count2 = 0; // B 시작

        char[][] patterns = {
                {'W', 'B'},
                {'B', 'W'}
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = map[x + i][y + j];

                if (current != patterns[i % 2][j % 2]) {
                    count1++;
                }

                if (current != patterns[(i + 1) % 2][j % 2]) {
                    count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}
