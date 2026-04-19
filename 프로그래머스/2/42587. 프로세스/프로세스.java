import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> queue = new LinkedList<>();
        int[] count = new int[10];
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < priorities.length; i++) {
            int priority = priorities[i];
            queue.offer(new int[] {priority, i});
            count[priority]++;
            max = Math.max(max, priority);
        }
        
        int order = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int priority = current[0];
            int index = current[1];
            
            if (priority == max) {
                order++;
                count[priority]--;
                
                if (index == location) {
                    return order;
                }
                
                while (count[max] == 0) {
                    max--;
                }
            } else {
                queue.offer(current);
            }
        }
        
        return -1;
    }
}

/**
큐에서 꺼낸뒤 나머지와 비교해서 더 높은 순위가 있다면 다시 큐에 넣기
큐에 원래 순서도 같이 저장해서 더 높은 우선순위가 없고 순서가 맞다면 리턴
*/