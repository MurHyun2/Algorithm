import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(iArr);
        
        sb.append(iArr[0]).append(" ").append(iArr[iArr.length - 1]);
        
        return sb.toString();
    }
}