class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
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