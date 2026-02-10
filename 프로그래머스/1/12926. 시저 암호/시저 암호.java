class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isUpperCase(c)) {
                char ch = (char) ((c - 'A' + n) % 26 + 'A');
                sb.append(ch);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) ((c - 'a' + n) % 26 + 'a');
                sb.append(ch);
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}