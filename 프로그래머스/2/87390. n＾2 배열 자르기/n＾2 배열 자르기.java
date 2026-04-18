import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            long idx = left + i;
            long r = idx / n;
            long c = idx % n;
            
            answer[i] = (int) (Math.max(r, c) + 1);
        }
        
        return answer;
    }
}

/*
1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5

00 01 02
10 11 12
20 21 22

0 ~ n-1, n-1
n-1, 0 ~ n-1

배열을 먼저 채우고 나누기 나머지를 통해 결과 구하기 > 시간초과
최댓값에서 + 1 해서 그냥 더하기
*/

