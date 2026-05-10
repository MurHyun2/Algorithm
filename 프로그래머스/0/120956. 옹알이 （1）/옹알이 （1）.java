class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String temp = word;

            for (String sound : sounds) {
                temp = temp.replace(sound, " ");
            }

            if (temp.isBlank()) {
                answer++;
            }
        }

        return answer;
    }
}