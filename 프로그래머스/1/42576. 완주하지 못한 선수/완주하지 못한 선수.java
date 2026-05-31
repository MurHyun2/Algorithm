import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> compMap = new HashMap<>();
        
        for (String runner : completion) {
            compMap.put(runner, compMap.getOrDefault(runner, 0) + 1);
        }
        
        for (String runner : participant) {
            int cnt = compMap.getOrDefault(runner, 0);
            if (cnt == 0) {
                return runner;
            }
            compMap.put(runner, compMap.get(runner) - 1);
        }
        
        return "";
    }
}