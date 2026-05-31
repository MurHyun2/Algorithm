import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int idx = 0;
        int days = 0;
        List<Integer> list = new ArrayList<>();
        
        while (idx < progresses.length) {
            int cnt = 0;
            
            while (idx < progresses.length &&
                   progresses[idx] + (speeds[idx] * days) >= 100) {
                cnt++;
                idx++;
            }
            
            if (cnt > 0) {
                list.add(cnt);
            }
            
            days++;
        }
        
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}