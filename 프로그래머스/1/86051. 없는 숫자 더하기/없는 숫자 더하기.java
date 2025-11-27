class Solution {
    public int solution(int[] numbers) {
        int total = 45;

        for (int n : numbers) {
            total -= n;
        }

        return total;
    }
}