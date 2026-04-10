import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            
            if (canPlace(size, park)) {
                return size;
            };
        }
        
        return -1;
    }
    
    private boolean canPlace(int size, String[][] park) {
        for (int r = 0; r <= park.length - size; r++) {
            for (int c = 0; c <= park[0].length - size; c++) {
                if (isEmptySquare(r, c, size, park)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean isEmptySquare(int nr, int nc, int size, String[][] park) {
        for (int r = nr; r < nr + size; r++) {
            for (int c = nc; c < nc + size; c++) {
                if (!park[r][c].equals("-1")) {
                    return false;
                }
            }
        }
        
        return true;
    }
}