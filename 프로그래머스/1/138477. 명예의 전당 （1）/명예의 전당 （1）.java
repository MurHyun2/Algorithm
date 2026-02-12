import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
            
        list.add(score[0]);
        answer[0] = score[0];
        
        for (int i = 1; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
            } else if (score[i] > list.get(0)) {
                list.remove(0);
                list.add(score[i]);
            }
            
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        
        return answer;
    }
}