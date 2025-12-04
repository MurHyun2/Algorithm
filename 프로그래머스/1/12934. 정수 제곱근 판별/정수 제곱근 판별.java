class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        
        if (x * x == n) {
            long next = x + 1;
            return next * next;
        }
        
        return -1;
    }
}