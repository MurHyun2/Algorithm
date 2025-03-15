import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] visited;
    static int[] den;
    static Queue<Node> q = new LinkedList<>();

    static class Node {
        int r, c, time;
        boolean isWater;

        Node(int r, int c, int time, boolean isWater) {
            this.r = r;
            this.c = c;
            this.time = time;
            this.isWater = isWater;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];
        
        Queue<Node> wq = new LinkedList<>();
        Node start = null;

        for (int i = 0; i < R; i++) {
            String input = br.readLine();

            for (int j = 0; j < C; j++) {
                map[i][j] = input.charAt(j);

                if (map[i][j] == 'S') {
                    visited[i][j] = true;
                    start = new Node(i, j, 0, false);
                } else if (map[i][j] == '*') {
                    wq.add(new Node(i, j, 0, true));
                } else if (map[i][j] == 'D') {
                    den = new int[]{i, j};
                }
            }
        }

        q.addAll(wq);
        q.add(start);

        int result = bfs();
        System.out.println(result == -1 ? "KAKTUS" : result);
    }

    private static int bfs() {
        while (!q.isEmpty()) {
            Node node = q.poll();

            if (!node.isWater && node.r == den[0] && node.c == den[1]) {
                return node.time;
            }

            for (int i = 0; i < 4; i++) {
                int nr = node.r + dr[i];
                int nc = node.c + dc[i];

                if (nr < 0 || nc < 0 || nr >= R || nc >= C || map[nr][nc] == 'X') {
                    continue;
                }

                if (node.isWater) {
                    if (map[nr][nc] == '.') {
                        map[nr][nc] = '*';
                        q.add(new Node(nr, nc, node.time + 1, true));
                    }
                } else {
                    if (visited[nr][nc] || map[nr][nc] == '*') {
                        continue;
                    }

                    visited[nr][nc] = true;
                    q.add(new Node(nr, nc, node.time + 1, false));
                }
            }
        }

        return -1;
    }
}