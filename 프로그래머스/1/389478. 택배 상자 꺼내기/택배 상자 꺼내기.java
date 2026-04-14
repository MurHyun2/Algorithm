import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int r = (n + w - 1) / w;
        int[][] boxes = new int[r][w];

        int cnt = 1;
        int tr = -1;
        int tc = -1;

        for (int i = 0; i < r && cnt <= n; i++) {
            boolean goRight = (i % 2 == 0);

            for (int j = 0; j < w && cnt <= n; j++) {
                int col = goRight ? j : w - 1 - j;

                boxes[i][col] = cnt;

                if (cnt == num) {
                    tr = i;
                    tc = col;
                }

                cnt++;
            }
        }

        int answer = 0;
        for (int i = tr; i < r; i++) {
            if (boxes[i][tc] != 0) {
                answer++;
            }
        }

        return answer;
    }
}

/*
[0][0] ~ [0][w-1] ~ [1][w-1] ~ [1][0] ~ [2][0] ~ [2][w-1]...
A를 꺼내려면 위에있는 모든 상자를 빼야함
총 몇개의 택배 상자를 꺼내는지 return

num / w 해서 몇번째 줄인지 구하기
%2 == 0 이면 왼쪽부터
%2 == 1 이면 오른쪽부터
*/