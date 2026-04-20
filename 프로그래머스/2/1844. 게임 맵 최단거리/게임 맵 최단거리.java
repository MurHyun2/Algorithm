import java.util.*;

class Solution {
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    
    public int solution(int[][] maps) {
        return bfs(maps);
    }
    
    int bfs(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Deque<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[] {0, 0, 1});
        maps[0][0] = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            int r = current[0];
            int c = current[1];
            int dist = current[2];
            
            if (r == n - 1 && c == m - 1) {
                return dist;
            }
            
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (nr < 0 || nc < 0 || nr >= n || nc >= m || maps[nr][nc] == 0) {
                    continue;
                }
                
                maps[nr][nc] = 0;
                queue.offer(new int[] {nr, nc, dist + 1});
            }
        }
        
        return -1;
    }
}