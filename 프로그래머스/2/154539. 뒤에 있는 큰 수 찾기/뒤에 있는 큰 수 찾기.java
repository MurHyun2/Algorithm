import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            
            while (!stack.isEmpty()) {
                int idx = stack.peek();
                
                if (numbers[idx] < cur) {
                    stack.pop();
                    answer[idx] = cur;
                } else {
                    break;
                }
            }
            
            stack.push(i);
        }
        
        return answer;
    }
}

/*
매번 보는건 n^2 로 시간초과가 나니 불가능
스택을 써서 넣을때마다 안에 있는 값을 확인해서 현재 값보다 작다면
현재값이 뒷큰수가 되니까 해당 숫자를 결과 배열에 저장
*/