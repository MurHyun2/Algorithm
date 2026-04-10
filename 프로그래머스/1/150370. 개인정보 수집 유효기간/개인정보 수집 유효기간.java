import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        
        int todayDays = toDays(today);
        
        int[] termsDay = new int[26];
        for (String term : terms) {
            String[] parts = term.split(" ");
            char type = parts[0].charAt(0);
            int months = Integer.parseInt(parts[1]);
            termsDay[type - 'A'] = months * 28; 
        }
        
        int idx = 1;
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            int type = parts[1].charAt(0);
            
            int expireDay = toDays(date) + termsDay[type - 'A'];
            
            if (todayDays >= expireDay) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    private int toDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return (year * 12 + month) * 28 + day;
    }
}