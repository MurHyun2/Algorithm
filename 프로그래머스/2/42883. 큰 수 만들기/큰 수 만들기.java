class Solution {
    public String solution(String number, int k) {
        int targetLength = number.length() - k;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < number.length(); i++) {
            char cur = number.charAt(i);
            
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < cur) {
                sb.setLength(sb.length() - 1);
                k--;
            }
            
            sb.append(cur);
        }
        
        return sb.substring(0, targetLength);
    }
}