class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int len = phone_number.length();
        String stars = "*".repeat(len - 4);
        String last4 = phone_number.substring(len - 4);
        answer = stars + last4;
        
        return answer;
    }
}