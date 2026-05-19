class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for (int i = start; i < end; i++) {
                arr[i]++;
            }
        }
        
        int answer = 0;
        
        for (int i : arr) {
            if (i > 1) {
                answer++;
            }
        }
        
        
        return answer;
    }
}
