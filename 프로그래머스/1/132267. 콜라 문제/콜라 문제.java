class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;
        
        while (empty >= a) {
            int gain = (empty / a) * b;
            answer += gain;
            empty = (empty % a) + gain;
        }
        
        return answer;
    }
}