import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] s1 = new int[] {1, 2, 3, 4, 5};
        int[] s2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (s1[i % s1.length] == answers[i]) scores[0]++;
            if (s2[i % s2.length] == answers[i]) scores[1]++;
            if (s3[i % s3.length] == answers[i]) scores[2]++;
        }
        
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == scores[i]) list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}