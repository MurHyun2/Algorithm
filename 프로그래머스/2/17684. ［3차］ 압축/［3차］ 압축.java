import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        int nextIndex = 27;
        int i = 0;

        while (i < msg.length()) {
            String w = String.valueOf(msg.charAt(i));
            int end = i + 1;

            while (end < msg.length() && 
                   dictionary.containsKey(w + msg.charAt(end))) {
                w += msg.charAt(end);
                end++;
            }

            result.add(dictionary.get(w));

            if (end < msg.length()) {
                dictionary.put(w + msg.charAt(end), nextIndex++);
            }

            i += w.length();
        }

        int[] answer = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            answer[j] = result.get(j);
        }

        return answer;
    }
}