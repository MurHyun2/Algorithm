class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zeroCnt = 0;
        String next = s;
        
        while (!next.equals("1")) {
            for (char ch : next.toCharArray()) {
                if (ch == '0') zeroCnt++;
            }
            
            next = next.replace("0", "");
            int n = next.length();
            next = Integer.toBinaryString(n);
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}