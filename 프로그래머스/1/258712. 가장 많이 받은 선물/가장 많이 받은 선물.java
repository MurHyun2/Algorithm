import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {        
        Map<String, Integer> idxMap = new HashMap<>();
        
        int max = 0;
        int fl = friends.length;
        
        for (int i = 0; i < fl; i++) {
            idxMap.put(friends[i], i);
        }
        
        int[][] giftArr = new int[fl][fl];
        int[] giftScore = new int[fl];
        
        for (int i = 0; i < gifts.length; i++) {
            String[] gift = gifts[i].split(" ");
            int fromIdx = idxMap.get(gift[0]);
            int toIdx = idxMap.get(gift[1]);
            
            giftArr[fromIdx][toIdx]++;
            giftScore[fromIdx]++;
            giftScore[toIdx]--;
        }

        for (int r = 0; r < fl; r++) {
            int giftCnt = 0;
            
            for (int c = 0; c < fl; c++) {
                if (giftArr[r][c] > giftArr[c][r]) {
                    giftCnt++;
                }
                else if (giftArr[r][c] == giftArr[c][r]) {
                    if (giftScore[r] > giftScore[c]) {
                        giftCnt++;
                    }
                }
            }
            
            max = Math.max(max, giftCnt);
        }
        
        return max;
    }
}

/*
두 사람이 선물을 주고 받았고,
횟수가 다르다면 선물 횟수가 많은 사람이 다음달 선물 받음
기록이 없거나 횟수가 같다면,
선물 지수가 큰 사람이 다음달 선물 받음, 선물 지수가 같다면 다음달 선물 x
선물 지수 = 준 선물 - 받은 선물
다음달 선물 가장 많이 받을 친구의 선물 수 리턴
gifts 배열은 from to

hashmap을 써서 사람 idx 정리한 뒤
배열로 변환해서 선물 횟수 정리
준 선물과 받은 선물을 계산해서 선물 지수를 배열에 정리

이후 모든 사람과 비교하면서 내가 더 크면 +1 같으면 선물 지수 비교 후 +1
최댓값 리턴
*/