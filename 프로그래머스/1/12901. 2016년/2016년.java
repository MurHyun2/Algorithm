class Solution {
    public String solution(int a, int b) {
        int[] days = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheWeek = new String[] 
            {"FRI", "SAT", "SUN", "MON", "TUE" ,"WED", "THU"};
        
        int sum = b - 1;
        
        for (int i = 0; i < a - 1; i++) {
            sum += days[i];
        }
            
        return dayOfTheWeek[(sum % 7)];
    }
}