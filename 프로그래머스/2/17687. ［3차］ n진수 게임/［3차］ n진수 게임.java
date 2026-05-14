class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int num = 0;

        while (answer.length() < t) {
            String str = Integer.toString(num++, n).toUpperCase();
            sb.append(str);
            
            for (int i = p - 1; i < sb.length(); i += m) {
                String pick = "" + sb.charAt(i);
                
                if (answer.length() < t) {
                    answer.append(pick);                     
                }
            }
            
            if (answer.length() < t) {
                answer.setLength(0);
            }
        }
            
        return answer.toString();
    }
}

// 011011100