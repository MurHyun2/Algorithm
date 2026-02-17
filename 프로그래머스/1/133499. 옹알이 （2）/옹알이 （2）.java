class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }
            
            s = s.replace("aya", " ")
                 .replace("ye", " ")
                 .replace("woo", " ")
                 .replace("ma", " ");
            
            if (s.trim().isEmpty()) answer++;
        }
        
        return answer;
    }
}