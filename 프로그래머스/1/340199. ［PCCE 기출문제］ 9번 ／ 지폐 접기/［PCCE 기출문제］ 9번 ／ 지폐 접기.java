import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (true) {
            Arrays.sort(wallet);
            Arrays.sort(bill);
            
            if (bill[0] <= wallet[0] && bill[1] <= wallet[1]) break;
            
            for (int i = 0; i < 2; i++) {
                if (bill[i] > wallet[i]) {
                    bill[1] = bill[1] / 2;
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}