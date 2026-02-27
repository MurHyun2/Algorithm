import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> set = new HashSet<>();
        
        for (char ch : skip.toCharArray()) {
            set.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            char cur = ch;
            int cnt = 0;
            
            while (cnt < index) {
                cur++;
                if (cur > 'z') cur = 'a';
                if (set.contains(cur)) continue;
                cnt++;
            }
            
            sb.append(cur);
        }
        
        
        return sb.toString();
    }
}