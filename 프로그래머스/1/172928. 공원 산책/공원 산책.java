import java.util.*;

class Solution {
    
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        int r = 0;
        int c = 0;
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                }
            }
        }
        
        for (String route : routes) {
            int[] move = getRoute(route);
            int nr = r;
            int nc = c;
            boolean success = true;
            
            for (int i = 0; i < move[2]; i++) {
                nr += move[0];
                nc += move[1];
                
                if (nr < 0 || nc < 0 || nr >= h || nc >= w || park[nr].charAt(nc) == 'X') {
                    success = false;
                    break;
                }
            }
            
            if (success) {
                r = nr;
                c = nc;
            }
        }
        
        return new int[] {r, c};
    }
    
    private int[] getRoute(String route) {
        String[] t = route.split(" ");
        String direction = t[0];
        int cnt = Integer.parseInt(t[1]);
        
        switch (direction) {
            case "E": 
                return new int[] {0, 1, cnt};
            case "W":
                return new int[] {0, -1, cnt};
            case "N":
                return new int[] {-1, 0, cnt};
            case "S":
                return new int[] {1, 0, cnt};
            default: 
                throw new IllegalArgumentException(route);
        }
    }
}