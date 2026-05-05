import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = makeList(str1);
        List<String> list2 = makeList(str2);

        double jscore = getJscore(list1, list2);

        return (int) (jscore * 65536);
    }

    private List<String> makeList(String str) {
        str = str.toLowerCase();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char cur = str.charAt(i);
            char next = str.charAt(i + 1);

            if (cur < 'a' || cur > 'z' || next < 'a' || next > 'z') {
                continue;
            }

            list.add("" + cur + next);
        }

        return list;
    }

    private double getJscore(List<String> list1, List<String> list2) {
        List<String> temp = new ArrayList<>(list2);

        int intersection = 0;
        int union = list1.size() + list2.size();

        for (String str : list1) {
            for (int i = 0; i < temp.size(); i++) {
                if (str.equals(temp.get(i))) {
                    intersection++;
                    temp.remove(i);
                    break;
                }
            }
        }

        union -= intersection;

        if (union == 0) {
            return 1;
        }

        return (double) intersection / union;
    }
}