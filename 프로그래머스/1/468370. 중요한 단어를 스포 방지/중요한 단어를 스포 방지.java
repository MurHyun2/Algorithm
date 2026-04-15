import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int n = message.length();
        boolean[] hidden = new boolean[n];
        
        for (int[] range : spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                hidden[i] = true;
            }
        }
        
        Set<String> seenWords = new HashSet<>();
        List<String> hiddenWords = new ArrayList<>();
        
        int start = 0;
        while (start < n) {
            int end = start;
            boolean isSpoiler = false;
            
            while (end < n && message.charAt(end) != ' ') {
                if (hidden[end]) {
                    isSpoiler = true;
                }
                end++;
            }
            
            String word = message.substring(start, end);
            
            if (isSpoiler) {
                hiddenWords.add(word);
            } else {
                seenWords.add(word);
            }
            
            start = end + 1;
        }
        
        int answer = 0;
        
        for (String word : hiddenWords) {
            if (!seenWords.contains(word)) {
                seenWords.add(word);
                answer++;
            }
        }
        
        return answer;
    }
}

/*
단어는 공백으로 구분 알파벳 소문자 + 숫자
문자들의 인덱스 중 하나 이상 스포 방지에 포함 되면 단어 전체 스포일러 방지
중요한 단어 ->
1. 스포 방지 단어
2. 스포 방지 구간 외 등장하지 않아야함
3. 중복 x
4. 여러 단어가 동시 공개 된 경우 왼쪽부터 순서대로 체크(앞에서 등장했는데 뒤에 단어가 스포 방지 처리 되었으면 유일한 단어 처리함)

스포일러인 부분들을 체크해서 boolean으로 idx 관리
공백이나 마지막전까지 idx를 올려가며 추가
스포일러인 부분이 포함 되었다면 스포일러 리스트에 추가
공백이나 마지막이라면 set에 넣어서 중복 관리
스포일러 리스트들을 순회하면서 set에 중복 체크 후 중복이 아니라면 answer++
*/