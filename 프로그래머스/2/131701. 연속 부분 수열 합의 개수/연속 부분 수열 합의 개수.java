import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> sumSet = new HashSet<>();
        
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                
                for (int k = 0; k < len; k++) {
                    sum += elements[(start + k) % n];
                }
                
                sumSet.add(sum);
            }
        }
        
        return sumSet.size();
    }
}

/*
완탐으로 모든 수를 돌리면서 set에 합을 담고 갯수를 리턴
*/