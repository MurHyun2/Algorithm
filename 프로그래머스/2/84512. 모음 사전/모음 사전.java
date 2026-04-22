class Solution {
    public int solution(String word) {
        String vowels = "AEIOU";
        int[] weights = {781, 156, 31, 6, 1};
        int answer = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = vowels.indexOf(ch);
            answer += idx * weights[i] + 1;
        }
        
        return answer;
    }
}