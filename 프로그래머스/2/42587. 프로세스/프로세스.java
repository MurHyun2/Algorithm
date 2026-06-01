import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] count = new int[10];
        int max = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            int priority = priorities[i];
            queue.offer(i);
            count[priority]++;
            max = Math.max(max, priority);
        }
        
        int order = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int priority = priorities[cur];
            
            if (priority == max) {
                count[priority]--;
                order++;
                
                if (cur == location) {
                    return order;
                }
                
                while (count[max] == 0) {
                    max--;
                }
            } else {
                queue.offer(cur);
            }
        }
        
        return -1;
    }
}

