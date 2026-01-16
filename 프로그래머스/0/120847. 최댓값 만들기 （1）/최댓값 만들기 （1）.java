import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        int lastNum = numbers.length - 1;
        
        return numbers[lastNum] * numbers[lastNum - 1];
    }
}