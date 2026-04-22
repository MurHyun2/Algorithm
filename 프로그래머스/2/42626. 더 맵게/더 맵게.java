import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for (int i : scoville) {
            pq.offer((long) i);
        }
        
        int cnt = 0;
        
        while (pq.size() >= 2 && pq.peek() < K) {
            long first = pq.poll();
            long second = pq.poll();
            long mixed = first + (second * 2L);
            
            pq.offer(mixed);
            cnt++;
        }
        
        return pq.peek() >= K ? cnt : -1;
    }
}

/*
섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
스코빌 지수가 K 이상이 될 때까지 반복

정렬해서 작은것 끼리 먼저 합친다음 K이상이면 멈추기
섞은 횟수 리턴
못하면 -1
*/
