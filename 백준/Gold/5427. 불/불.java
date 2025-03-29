import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, w, h;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] fVisited, mVisited;
    static Queue<int[]> fires = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            map = new char[h][w];
            fVisited = new boolean[h][w];
            mVisited = new boolean[h][w];
            int[] man = new int[4];

            for (int j = 0; j < h; j++) {
                map[j] = br.readLine().toCharArray();

                for (int k = 0; k < w; k++) {
                    if (map[j][k] == '*') {
                        fVisited[j][k] = true;
                        fires.add(new int[]{j, k});
                    }

                    if (map[j][k] == '@') {
                        mVisited[j][k] = true;
                        man = new int[]{j, k, 0, 1};
                    }
                }
            }

            int result = bfs(man);

            System.out.println(result == 0 ? "IMPOSSIBLE" : result);
        }
    }

    private static int bfs(int[] man) {
        Queue<int[]> q = new LinkedList<>();

        while (!fires.isEmpty()) {
            int[] cur = fires.poll();
            q.add(new int[]{cur[0], cur[1], 1, 0});
        }

        q.add(new int[]{man[0], man[1], man[2], man[3]});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            boolean isMan = cur[2] == 0;
            int time = cur[3];

            if (isMan) {
                if (x == h - 1 || y == w - 1 || x == 0 || y == 0) {
                    return time;
                }
            }

            for (int k = 0; k < 4; k++) {
                int nx = x + dr[k];
                int ny = y + dc[k];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w || fVisited[nx][ny] || map[nx][ny] == '#') {
                    continue;
                }

                if (isMan && !mVisited[nx][ny]) {
                    mVisited[nx][ny] = true;
                    q.add(new int[]{nx, ny, 0, time + 1});
                }

                if (!isMan) {
                    fVisited[nx][ny] = true;
                    q.add(new int[]{nx, ny, 1, 0});
                }
            }
        }

        return 0;
    }
}