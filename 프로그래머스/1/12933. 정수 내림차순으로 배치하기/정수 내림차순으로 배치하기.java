import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while(n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }
        
        list.sort(Collections.reverseOrder());
        
        for (int i : list) {
            answer = (answer * 10) + i;
        }
        
        return answer;
    }
}