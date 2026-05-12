import java.util.*;

class Solution {
    public int solution(int[] order) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        int idx = 0;
        int n = order.length;
        
        for (int box = 1; box <= n; box++) {
            stack.push(box);
            
            while (!stack.isEmpty() && idx < n && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
            }
        }
        
        return idx;
    }
}

/*
1 ~ n 까지 순서대로 for문
스택에 넣고 while을 통해 일치여부 확인
idx 리턴
*/