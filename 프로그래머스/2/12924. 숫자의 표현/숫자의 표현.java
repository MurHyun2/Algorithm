class Solution {
    public int solution(int n) {
        int left = 1, right = 1, sum = 1, cnt = 0;
        
        while (left <= n) {
            if (sum == n) {
                cnt++;
                sum -= left++;
            } else if (sum < n) {
                right++;
                sum += right;
            } else {
                sum -= left++;
            }
        }

        return cnt;
    }
}