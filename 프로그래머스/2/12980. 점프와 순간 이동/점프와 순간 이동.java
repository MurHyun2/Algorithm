import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int num = n;
        
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
                ans++;    
            }
        }

        return ans;
    }
}