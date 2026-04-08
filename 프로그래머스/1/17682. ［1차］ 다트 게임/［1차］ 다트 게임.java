class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int round = 0;
        int i = 0;
        
        while (i < dartResult.length()) {
            int num = 0;
            while (Character.isDigit(dartResult.charAt(i))) {
                num = num * 10 + (dartResult.charAt(i) - '0');
                i++;
            }
            
            char bonus = dartResult.charAt(i++);
            int score = 0;
            
            if (bonus == 'S') {
                score = num;
            } else if (bonus == 'D') {
                score = num * num;
            } else if (bonus == 'T') {
                score = num * num * num;
            }
            
            scores[round] = score;
            
            if (i < dartResult.length()) {
                char option = dartResult.charAt(i);
                
                if (option == '*') {
                    scores[round] *= 2;
                    if (round > 0) {
                        scores[round - 1] *= 2;
                    }
                    i++;
                } else if (option == '#') {
                    scores[round] *= -1;
                    i++;
                }
            }
            
            round++;
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}