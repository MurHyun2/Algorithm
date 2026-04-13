import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] mbti = new String[] {"RT", "CF", "JM", "AN"};
        
        int[] mbtiScore = new int[4];
            
        for (int i = 0; i < survey.length; i++) {
            int[] info = getMbtiIdx(survey[i]);
            int idx = info[0];
            int type = info[1];
            
            if (type < 0) {
                mbtiScore[idx] += (choices[i] - 4);
            } else {
                mbtiScore[idx] += (4 - choices[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int scr = mbtiScore[i];
            int idx = 0;
            char[] ch = mbti[i].toCharArray();
            
            if (scr > 0) { 
                sb.append(ch[1]);
            } else if (scr < 0) {
                sb.append(ch[0]);
            } else {
                Arrays.sort(ch);
                sb.append(ch[0]);
            }
        }
        
        return sb.toString();
    }
    
    private int[] getMbtiIdx (String str) {
        switch (str.charAt(0)) {
            case 'R':
                return new int[] {0, -1};
            case 'T':
                return new int[] {0, 0};
            case 'C':
                return new int[] {1, -1};
            case 'F':
                return new int[] {1, 0};
            case 'J':
                return new int[] {2, -1};
            case 'M':
                return new int[] {2, 0};
            case 'A':
                return new int[] {3, -1};
            case 'N':
                return new int[] {3, 0};
            default: throw new IllegalArgumentException();
        }
    }
}

/*
선택지로 -3 ~ +3 의 점수 (질문에 따라 반대일 수도 있음) (1 ~ 7)
각 지표에서 높은 점수의 성격 유형 선택
성격 유형 점수가 같다면 사전 순으로 빠른 성격 유형
*/