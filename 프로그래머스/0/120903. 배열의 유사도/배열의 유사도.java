import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>();

        for (String str : s2) {
            set.add(str);
        }

        int count = 0;

        for (String str : s1) {
            if (set.contains(str)) {
                count++;
            }
        }

        return count;
    }
}
