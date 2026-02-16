class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) answer++;
        }
        
        return answer;
    }
    
    private boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        
        return true;
    }
}