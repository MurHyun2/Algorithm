import java.io.*;
import java.util.*;

public class Main {
    
    static class Fish {
        int x, s, w;
        Fish(int x, int s, int w) {
            this.x = x;
            this.s = s;
            this.w = w;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        Fish[] fish = new Fish[n];
        int sumx = 0;
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            fish[i] = new Fish(x, s, w);
            sumx += x;
        }
        
        Arrays.sort(fish, (a, b) -> b.s - a.s);
        long answer = 0;
        
        for (int i = 0; i <= sumx; i++) {
            int t = i;
            long profit = 0;
            boolean[] used = new boolean[n];
            
            while (true) {
                boolean found = false;
                
                for (int j = 0; j < n; j++) {
                    if (!used[j] && fish[j].x <= t) {
                        used[j] = true;
                        t -= fish[j].x;
                        profit += fish[j].w;
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    break;
                }
            }
            
            long net = profit - (long)i * c;
            
            if (net > answer) {
                answer = net;
            }
        }
        
        System.out.println(answer);
    }
}