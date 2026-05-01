import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        Set<Character> skillSet = new HashSet<>();

        for (int i = 0; i < skill.length(); i++) {
            skillSet.add(skill.charAt(i));
        }

        int answer = 0;

        for (String tree : skill_trees) {
            int idx = 0;
            boolean possible = true;

            for (int i = 0; i < tree.length(); i++) {
                char current = tree.charAt(i);

                if (!skillSet.contains(current)) {
                    continue;
                }

                if (skill.charAt(idx) == current) {
                    idx++;
                } else {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer++;
            }
        }

        return answer;
    }
}

/*
스킬을 순서대로 배우고 중복이 없으니 HashSet에 담아서 이전 스킬이 있는지 확인하기
스킬트리를 순서대로 보면서 set에 있는지 확인
있다면 idx 순서가 맞는지 확인 맞다면 idx++ 없다면 스킵
*/