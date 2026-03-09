import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> que = new LinkedList<>();
        
        for (int i : progresses) {
            que.add(i);
        }
        
        List<Integer> list = new ArrayList<>();
        
        int days = 1;
        int idx = 0;
        while(!que.isEmpty()) {
            int sum = 0;
            
            while(!que.isEmpty() && (que.peek() + speeds[idx] * days) >= 100) {
                que.poll();
                sum++;
                idx++;
            }
            
            if (sum != 0) list.add(sum);
            
            days++;
        }
        
        int[] answer = new int[list.size()];
        
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}