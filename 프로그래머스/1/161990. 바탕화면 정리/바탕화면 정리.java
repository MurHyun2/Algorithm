import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int minR = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;
        int maxR = 0;
        int maxC = 0;
        
        for (int r = 0; r < wallpaper.length; r++) {
            for (int c = 0; c < wallpaper[r].length(); c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    minR = Math.min(minR, r);
                    minC = Math.min(minC, c);
                    maxR = Math.max(maxR, r + 1);
                    maxC = Math.max(maxC, c + 1);
                }
            }
        }
        
        return new int[] {minR, minC, maxR, maxC};
    }
}

/*
파일들을 비교해서 시작 최솟값, 최댓값 r,c 를 구하고 리턴
*/