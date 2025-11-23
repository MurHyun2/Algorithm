class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        long start = 0;
        long end = 0;
        
        if (a <= b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }
        
        while(start <= end) {
            answer += start++;
        }
        
        return answer;
    }
}