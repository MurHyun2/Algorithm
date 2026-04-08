import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < win_nums.length; i++) {
            set.add(win_nums[i]);
        }
        
        int winCnt = 0;
        int zeroCnt = 0;
        
        for (int i = 0; i < win_nums.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
            }
            
            if (set.contains(lottos[i])) {
                winCnt++;
            }
        }
        
        answer[0] = 7 - (winCnt + zeroCnt);
        answer[1] = 7 - winCnt;
        
        if (answer[0] == 7) answer[0] = 6;
        if (answer[1] == 7) answer[1] = 6;
        
        return answer;
    }
}