import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int R = 12, C = 6;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[][] map = new char[R][C];
    static boolean[][] visited;
    static List<int[]> removePuyoList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        // 내린 뒤에 다시 bfs 돌려서 연쇄
        // 터진게 없다면 연쇄 수 리턴
        int cnt = 0;
        while (true) {
            visited = new boolean[R][C];

            for (int i = R - 1; i >= 0; i--) {
                for (int j = 0; j < C; j++) {
                    if (map[i][j] == '.' || visited[i][j]) {
                        continue;
                    }
                    removePuyo(i, j);
                }
            }

            if (removePuyoList.isEmpty()) {
                break;
            }

            movePuyo();
            cnt++;
        }

        System.out.println(cnt);
    }

    public static void removePuyo(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        List<int[]> puyoList = new ArrayList<>();
        visited[r][c] = true;
        puyoList.add(new int[]{r, c});
        q.add(new int[]{r, c});


        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];

                if (nr < 0 || nc < 0 || nr >= R || nc >= C || visited[nr][nc] || map[nr][nc] != map[r][c]) {
                    continue;
                }

                visited[nr][nc] = true;
                puyoList.add(new int[]{nr, nc});
                q.add(new int[]{nr, nc});
            }
        }

        // 4개 이상이면 연쇄
        if (puyoList.size() >= 4) {
            removePuyoList.addAll(puyoList);
        }
    }

    // List에서 C 위치 추출 후 해당 칸만
    // 0 -> R 까지 Stack에 담아서 R -> 0으로 쌓기
    private static void movePuyo() {
        HashSet<Integer> cCoord = new HashSet<>();

        for (int[] puyo : removePuyoList) {
            int r = puyo[0];
            int c = puyo[1];
            cCoord.add(c);
            map[r][c] = 'X';
        }

        for (int c : cCoord) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < R; i++) {
                if (map[i][c] != 'X') {
                    stack.push(map[i][c]);
                }
            }

            for (int i = R - 1; i >= 0; i--) {
                if (!stack.isEmpty()) {
                    map[i][c] = stack.pop();
                } else {
                    map[i][c] = '.';
                }
            }
        }

        removePuyoList.clear();
    }
}
