import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        
        char[] arr = String.valueOf(x).toCharArray();
        
        for (char ch : arr) {
            sum += (ch - '0');
        }
        
        if (x % sum != 0) answer = false;
        
        return answer;
    }
}