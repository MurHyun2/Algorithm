class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int n : arr) {
            if (n != min) answer[idx++] = n;
        }
        
        return answer;
    }
}