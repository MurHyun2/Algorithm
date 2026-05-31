class Solution {
    int n;
    int[][] computers;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        this.visited = new boolean[n];
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                cnt++;
                dfs(i);
            }
        }
        
        return cnt;
    }
    
    private void dfs(int cur) {
        visited[cur] = true;
        
        for (int next = 0; next < n; next++) {
            if (!visited[next] && computers[cur][next] == 1) {
                dfs(next);
            }
        }
    }
}