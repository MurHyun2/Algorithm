import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = getValue(ext);
        int sortIdx = getValue(sort_by);
        
        List<int[]> list = new ArrayList<>();
        
        for (int[] dt : data) {
            if (dt[extIdx] < val_ext) {
                list.add(dt);
            }
        }
        
        list.sort((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));
        
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private static int getValue(String key) {
        switch (key) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: throw new IllegalArgumentException();
        }
    }
}