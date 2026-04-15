import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        char[] messageWithSpoiler = message.toCharArray();
        int ml = message.length();
        StringBuilder sb = new StringBuilder();
        
        
        for (int[] spoiler_range : spoiler_ranges) {
            int start = spoiler_range[0];
            int end = spoiler_range[1];
            
            for (int i = start; i <= end; i++) {
                if (messageWithSpoiler[i] == ' ') continue;
                
                messageWithSpoiler[i] = '#';
            }
        }
        
        for (char ch : messageWithSpoiler) {
            sb.append(ch);
        }
        
        String spoilerMessage = sb.toString();
        String[] words = spoilerMessage.split(" ");
        Set<String> wordSet = new HashSet<>();
        
        for (String word : words) {
            wordSet.add(word);
        }
        
        int answer = 0;
        sb = new StringBuilder();
        boolean isSpoiler = false;
        
        for (int i = 0; i < ml; i++) {
            char ch = spoilerMessage.charAt(i);
            
            if (ch == '#') {
                sb.append(message.charAt(i));
                isSpoiler = true;
            } else if (ch != ' ') {
                sb.append(message.charAt(i));
            }
            
            if (i == ml - 1 || message.charAt(i) == ' ') {
                if (isSpoiler) {
                    String word = sb.toString();
                    isSpoiler = false;

                    if (!wordSet.contains(word)) {
                        wordSet.add(word);
                        answer++;
                    }
                }
                
                sb = new StringBuilder();
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

단어 배열 만들어서 단어들 스포 방지 포함해서 넣기
스포 방지 단어들 하나씩 체크하면서 존재 여부 + 중복 체크
*/