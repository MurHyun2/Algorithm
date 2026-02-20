import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        
        if (s.length() % 2 != 0) return 0;
        
        for (int i = 0; i < s.length(); i++) {
            char first = arr[i];
            if (first == ']' || first == '}' || first == ')') continue;

            Stack<Character> stack = new Stack<>();
            boolean valid = true;
            
            for (int j = 0; j < s.length(); j++) {
                char ch = arr[(i + j) % s.length()];
                 
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        valid = false;
                        break;
                    }
                    
                    char top = stack.peek();
                    
                    if (ch == ')' && top == '(' ||
                        ch == ']' && top == '[' ||
                        ch == '}' && top == '{') {
                        stack.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }
            
            if (valid && stack.isEmpty()) answer++;
        }
        
        return answer;
    }
}
