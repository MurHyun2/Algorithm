import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List<Integer>[] graph = new ArrayList[n + 1];
        
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int[] wire : wires) {
            int cutA = wire[0];
            int cutB = wire[1];
            
            boolean[] visited = new boolean[n + 1];
            
            int count = dfs(cutA, graph, visited, cutA, cutB);
            
            int other = n - count;
            int diff = Math.abs(other - count);
            
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfs(int cur, List<Integer>[] graph, boolean[] visited, int cutA, int cutB) {
        visited[cur] = true;
        int count = 1;
        
        for (int next : graph[cur]) {
            if ((cur == cutA && next == cutB) ||
                (cur == cutB && next == cutA)) {
                continue;
            }
            
            if (!visited[next]) {
                count += dfs(next, graph, visited, cutA, cutB);
            }
        }
        
        return count;
    }
}