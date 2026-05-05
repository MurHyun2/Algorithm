import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int[] count1 = makeCount(str1);
        int[] count2 = makeCount(str2);
        
        int intersection = 0;
        int union = 0;
        
        for (int i = 0; i < 26 * 26; i++) {
            intersection += Math.min(count1[i], count2[i]);
            union += Math.max(count1[i], count2[i]);
        }
        
        if (union == 0) {
            return 65536;
        }
        
        return intersection * 65536 / union;
    }
    
    private int[] makeCount(String str) {
        int[] count = new int[26 * 26];
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            
            if (!isAlphabet(first) || !isAlphabet(second)) {
                continue;
            }
            
            count[((first - 'a') * 26) + (second - 'a')]++;
        }
        
        return count;
    }
    
    private boolean isAlphabet(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}