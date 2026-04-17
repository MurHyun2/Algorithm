import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cache.remove(city)) {
                answer += 1;
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
            }
            
            cache.addLast(city);
        }
        
        return answer;
    }
}

/*
캐시크기에 따른 실행시간측정 캐시는 LRU 알고리즘 사용
Set에서 캐시 관리하기
큐써서 매입력 사이즈 체크 + 히트시 빼서 다시 큐에 쌓기
*/