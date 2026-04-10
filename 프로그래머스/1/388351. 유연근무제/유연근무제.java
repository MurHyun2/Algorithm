class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            boolean isSuccess = true;
            
            int hour = (schedules[i] / 100) + 
                            (((schedules[i] % 100) + 10) / 60);
            int min = ((schedules[i] % 100) + 10) % 60;
            int deadlineTime = hour * 100 + min;
            
            for (int j = 0; j < 7; j++) {
                int today = (startday + j - 1) % 7;
                
                if (today > 4) continue;
                
                if (timelogs[i][j] > deadlineTime) {
                    isSuccess = false;
                    break;
                }
            }
            
            if (isSuccess) answer++;
        }
        
        return answer;
    }
}