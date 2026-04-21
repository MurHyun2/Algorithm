import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Integer, Integer> tupleMap = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    int num = Integer.parseInt(sb.toString());
                    tupleMap.put(num, tupleMap.getOrDefault(num, 0) + 1);
                    sb.setLength(0);
                }
            }
        }
        
        List<Integer> list = new ArrayList<>(tupleMap.keySet());
        list.sort((a, b) -> tupleMap.get(b) - tupleMap.get(a));
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}