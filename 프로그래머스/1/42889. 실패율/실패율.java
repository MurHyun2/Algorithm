import java.util.*;

class Solution {
    static class StageRate {
        int stage;
        double rate;
        
        StageRate(int stage, double rate) {
            this.stage = stage;
            this.rate = rate;
        }
    }
    
    
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : stages) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int players = stages.length;
        List<StageRate> list = new ArrayList<>(N);
        
        for (int stage = 1; stage <= N; stage++) {
            int stuck = map.getOrDefault(stage, 0);
            double rate = (players == 0) ? 0.0 : (double) stuck / players;
            
            list.add(new StageRate(stage, rate));
            
            players -= stuck;
        }
        
        list.sort((a, b) -> {
           int cmp = Double.compare(b.rate, a.rate);
            if (cmp != 0) return cmp;
            return Integer.compare(a.stage, b.stage);
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).stage;
        }
        
        return answer;
    }
}