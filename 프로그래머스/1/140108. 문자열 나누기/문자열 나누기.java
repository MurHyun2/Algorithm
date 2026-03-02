class Solution {
    public int solution(String s) {
        int answer = 1;
        
        int sameCnt = 1;
        int diffCnt = 0;
        char cur = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            char now = s.charAt(i);
            
            if (sameCnt == diffCnt) {
                cur = now;
                sameCnt = 1;
                diffCnt = 0;
                answer++;
                continue;
            }
            
            if (cur == now) {
                sameCnt++;
            } else {
                diffCnt++;
            }
        }
        
        return answer;
    }
}