import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        
        for (int i = 0; i < n; i++) {
            binaryArr1[i] = Integer.toBinaryString(arr1[i]);
            binaryArr2[i] = Integer.toBinaryString(arr2[i]);
        }
        
        for (int i = 0; i < n; i++) {
            char[] ch1 = binaryArr1[i].toCharArray();
            char[] ch2 = binaryArr2[i].toCharArray();
            
            Stack<Character> s1 = new Stack<>();
            Stack<Character> s2 = new Stack<>();
            
            for (int j = ch1.length - 1; j >= 0; j--) {
                s1.push(ch1[j]);
            }
            for (int j = ch2.length - 1; j >= 0; j--) {
                s2.push(ch2[j]);
            }
            
            while (s1.size() < n) {
                s1.push('0');
            }
            while (s2.size() < n) {
                s2.push('0');
            }
            
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                char a = s1.pop();
                char b = s2.pop();
                
                if (a == '0' && b == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}