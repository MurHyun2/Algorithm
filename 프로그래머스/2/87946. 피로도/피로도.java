import java.util.*;

class Solution {
    int max = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return max;
    }
    
    private void dfs(int fatigue, int[][] dungeons, int count) {
        max = Math.max(max, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0];
            int use = dungeons[i][1];
            
            if (!visited[i] && fatigue >= need) {
                visited[i] = true;
                dfs(fatigue - use, dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
}

/*
최소 피로도 -> 입장을 위한 피로도, 소모 피로도 -> 던전 탐험 후 소모 피로도
각 던전은 하루에 한번만, 최대한 많은 던전 탐험

각 던전들을 완탐으로 풀고 최댓값 저장

[[80,80],[79,1],[78,1],[77,77],[76,1],[75,75]]
79 78 76 75
*/
