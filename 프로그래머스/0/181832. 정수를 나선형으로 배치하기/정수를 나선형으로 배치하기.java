class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        int r = 0;
        int c = 0;
        int dir = 0;
        
        for (int num = 1; num <= n * n; num++) {
            answer[r][c] = num;
            
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            
            if (nr >= n || nc >= n || nr < 0 || nc < 0 || answer[nr][nc] != 0) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
            
            r = nr;
            c = nc;
        }
        
        return answer;
    }
}

// 우, 하, 좌, 상