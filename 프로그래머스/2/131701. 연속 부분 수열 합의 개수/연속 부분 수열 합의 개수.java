import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int n = elements.length;
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = elements[i % n];
        }
        
        int[] prefix = new int[2 * n + 1];
        for (int i = 0; i < 2 * n; i++) {
            prefix[i + 1] = prefix[i] + elements[i % n];
        }
        
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = prefix[start + len] - prefix[start];
                sumSet.add(sum);
            }
        }
        
        return sumSet.size();
    }
}

/*
0 7 16 17 18 22 29 38 39 40 44
*/
