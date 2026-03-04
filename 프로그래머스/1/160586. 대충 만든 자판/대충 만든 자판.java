import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        final int INF = 1_000_000;
        int[] arr = new int[26];
        Arrays.fill(arr, INF);
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                int idx = key.charAt(i) - 'A';
                arr[idx] = Math.min(arr[idx], i + 1);
            }
        }

        int[] answer = new int[targets.length];
        int idx = 0;
        
        for (String target : targets) {
            int sum = 0;
            boolean possible = true;
            
            for (int i = 0; i < target.length(); i++) {
                int p = arr[target.charAt(i) - 'A'];
                if (p == INF) {
                    possible = false;
                    break;
                }
                sum += p;
            }
            
            answer[idx++] = possible ? sum : -1;
        }
        
        return answer;
    }
}