import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int r, c, cnt;
    static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            c = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());

            if (r == 0 && c == 0) {
                break;
            }

            arr = new int[r][c];
            visited = new boolean[r][c];

            //입력
            for (int i = 0; i < r; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < c; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //bfs
            cnt = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] == 0 || visited[i][j]) {
                        continue;
                    }

                    bfs(i, j);
                    cnt++;
                }
            }

            //sb에 입력
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int nx = temp[0];
            int ny = temp[1];

            for (int k = 0; k < 8; k++) {
                int nr = nx + dr[k];
                int nc = ny + dc[k];

                if (nr < 0 || nc < 0 || nr >= r || nc >= c || visited[nr][nc] || arr[nr][nc] == 0) {
                    continue;
                }

                q.add(new int[]{nr, nc});
                visited[nr][nc] = true;
            }
        }
    }
}