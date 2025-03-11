import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[][] arr, cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while(true) {
            N = Integer.parseInt(br.readLine());

            // 0 이 입력되면 종료
            if( N == 0 ) {
                break;
            }

            idx++;

            arr = new int[N][N];
            cost = new int[N][N];

            // 배열 초기화
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }

            dijkstra();

            sb.append("Problem ").append(idx).append(": ").append(cost[N-1][N-1]).append("\n");
        }

        System.out.println(sb);
    }

    private static void dijkstra() {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.add(new int[] {0, 0, arr[0][0]});
        cost[0][0] = arr[0][0];

        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            int r = cur[0];
            int c = cur[1];
            int curCost = cur[2];

            if(curCost < cost[r][c]) {
                continue;
            }

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr < 0 || nc < 0 || nr >= N || nc >= N) {
                    continue;
                }

                int nextCost = curCost + arr[nr][nc];
                if(nextCost < cost[nr][nc]) {
                    cost[nr][nc] = nextCost;
                    pq.add(new int[]{nr, nc, nextCost});
                }
            }
        }
    }
}