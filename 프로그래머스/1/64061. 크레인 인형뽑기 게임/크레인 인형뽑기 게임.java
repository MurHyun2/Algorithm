import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> basket = new ArrayDeque<>();
        int n = board.length;
        
        for (int move : moves) {
            int c = move - 1;
            
            for (int r = 0; r < n; r++) {
                int doll = board[r][c];
                
                if (doll != 0) {
                    board[r][c] = 0;
                    
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(doll);
                    }
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}