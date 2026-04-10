import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String player : callings) {
            int cur = map.get(player);
            String frontPlayer = players[cur - 1];
            
            players[cur - 1] = player;
            players[cur] = frontPlayer;
            
            map.put(player, cur - 1);
            map.put(frontPlayer, cur);
        }
        
        return players;
    }
}