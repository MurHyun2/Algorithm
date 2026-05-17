import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) {
            return 0;
        }
        
        boolean[] visited = new boolean[y + 1];
        Deque<int[]> queue = new ArrayDeque<>();
        
        queue.offer(new int[]{x, 0});
        visited[x] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            int num = cur[0];
            int cnt = cur[1];
            
            int[] nexts = {
                num + n,
                num * 2,
                num * 3
            };
            
            for (int next : nexts) {
                if (next == y) {
                    return cnt + 1;
                }
                
                if (next < y && !visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, cnt + 1});
                }
            }
        }
        
        return -1;
    }
}