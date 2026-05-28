import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        
        int left = 0;
        int sum = 0;
        
        int bestStart = 0;
        int bestEnd = n - 1;
        int bestLen = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            sum += sequence[right];
            
            while (sum > k) {
                sum -= sequence[left];
                left++;
            }
            
            if (sum == k) {
                int curLen = right - left + 1;
                
                if (curLen < bestLen) {
                    bestLen = curLen;
                    bestStart = left;
                    bestEnd = right;
                }
            }
        }
        
        return new int[] {bestStart, bestEnd};
    }
}

/*
슬라이딩 윈도우
*/