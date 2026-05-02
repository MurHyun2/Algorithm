import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int r = 0;
        int c = 0;
        
        Set<String> visited = new HashSet<>();
        
        for (int i = 0; i < dirs.length(); i++) {
            char ch = dirs.charAt(i);
            
            int nr = r;
            int nc = c;
            
            switch (ch) {
                case 'U': 
                    nr++;
                    break;
                case 'D': 
                    nr--;
                    break;
                case 'R': 
                    nc++;
                    break;
                case 'L': 
                    nc--;
                    break;
            }
            
            if (nr < -5 || nr > 5 || nc < -5 || nc > 5) {
                continue;
            }
            
            String from = r + "," + c;
            String to = nr + "," + nc;
            String fromTo = from + "->" + to;
            String toFrom = to + "->" + from;
            
            if (!visited.contains(fromTo) && !visited.contains(toFrom)) {
                visited.add(fromTo);
                visited.add(toFrom);
                answer++;
            }
            
            
            r = nr;
            c = nc;
        }
        
        return answer;
    }
}