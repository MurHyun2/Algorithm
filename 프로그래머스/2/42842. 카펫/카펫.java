class Solution {
    public int[] solution(int brown, int yellow) {
        
        int total = brown + yellow;
        
        for (int w = 3; w <= total; w++) {
            if (total % w == 0) {
                int h = total / w;
                
                if (w < h) continue;
                
                if ((w - 2) * (h - 2) == yellow) {
                    return new int[]{w, h};
                }
            }
        }
        
        return null;
    }
}