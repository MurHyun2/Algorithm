import java.util.*;
import java.io.*;

class Main {
    
    static List<Integer>[] list;
    static boolean[] visited;
    
    private static void dfs(int num, int depth) {
        if (depth == 2) return;
        
        for(int i = 0; i < list[num].size(); i++) {
            int next = list[num].get(i);
            visited[next] = true;
            dfs(next, depth + 1);
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < m; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            list[from].add(to);
            list[to].add(from);
        }
        
        visited[1] = true;
        dfs(1, 0);
        int ans = 0;
        
        for(int i = 2; i <= n; i++) {
            if(visited[i]) ans++;
        }
        
        System.out.println(ans);
    }
}