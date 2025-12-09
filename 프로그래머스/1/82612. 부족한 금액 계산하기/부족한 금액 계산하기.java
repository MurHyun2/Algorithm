class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }
        
        long answer = 0;
        if (money - sum < 0) answer = (money - sum) * -1;

        return answer;
    }
}