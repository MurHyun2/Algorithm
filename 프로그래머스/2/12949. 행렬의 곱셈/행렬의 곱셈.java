class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r = arr1.length;
        int c = arr1[0].length;
        int p = arr2[0].length;
        
        int[][] answer = new int[r][p];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < c; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}