import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int R, C, time;
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};
    static int[][] map;
    static boolean[][] isAir;
    static Queue<int[]> cq = new LinkedList<int[]>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    cq.offer(new int[]{i, j});
                }
            }
        }

        time = 0;
        while (true) {
            isAir = new boolean[R][C];
            findAir();
            
            if (!meltingCheese()) {
                break;
            }
            
            time++;
        }

        System.out.println(time);
    }

    private static void findAir() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr < 0 || nc < 0 || nr >= R || nc >= C || isAir[nr][nc] || map[nr][nc] == 1) {
                    continue;
                }

                isAir[nr][nc] = true;
                q.add(new int[]{nr, nc});
            }
        }
    }

    private static boolean meltingCheese() {
        Queue<int[]> nextCq = new LinkedList<>();
        boolean melted = false;

        while (!cq.isEmpty()) {
            int[] cur = cq.poll();
            int r = cur[0];
            int c = cur[1];

            int airCnt = 0;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr < 0 || nc < 0 || nr >= R || nc >= C || !isAir[nr][nc]) {
                    continue;
                }

                airCnt++;
            }

            if (airCnt >= 2) {
                map[r][c] = 0;
                melted = true;
            } else {
                nextCq.offer(new int[]{r, c});
            }

        }

        cq = nextCq;

        return melted;
    }
}
