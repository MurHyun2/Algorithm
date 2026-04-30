import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }

        return answer;
    }
}

/*
아직 가격이 떨어진 시점을 만나지 못한 인덱스를 스택에 저장한다.
현재 가격이 스택 top 인덱스의 가격보다 낮다면,
가격이 떨어진 것이므로 해당 인덱스를 꺼내 기간을 계산한다.
이때 여러 인덱스의 가격이 동시에 떨어질 수 있으므로 while로 처리한다.
*/