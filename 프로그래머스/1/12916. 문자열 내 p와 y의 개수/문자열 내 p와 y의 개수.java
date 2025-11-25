class Solution {
    boolean solution(String s) {

        char[] arr = s.toCharArray();
        int pCnt = 0;
        int yCnt = 0;
        
        for (char ch : arr) {
            if (ch == 'p' || ch == 'P') pCnt++;
            if (ch == 'y' || ch == 'Y') yCnt++;
        }
        
        return pCnt == yCnt;
    }
}