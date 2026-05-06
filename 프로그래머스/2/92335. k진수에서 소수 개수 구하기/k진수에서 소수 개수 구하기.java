import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        
        String[] arr = sb.reverse().toString().split("0");
        
        for (String str : arr) {
            if (str.isEmpty()) {
                continue;
            }
            
            long num = Long.parseLong(str);
            
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}