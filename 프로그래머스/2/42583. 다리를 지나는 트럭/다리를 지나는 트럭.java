import java.util.*;

class Solution {
    static class Truck {
        int weight;
        int exitTime;
        
        Truck(int weight, int exitTime) {
            this.weight = weight;
            this.exitTime = exitTime;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge = new ArrayDeque<>();
        
        int time = 1;
        int idx = 0;
        int totalWeight = 0;
        int answer = 0;
        
        while(idx < truck_weights.length) {
            if (!bridge.isEmpty() &&
                    bridge.peek().exitTime <= time) {
                Truck cur = bridge.poll();
                totalWeight -= cur.weight;
            }
            
            int nextTruck = truck_weights[idx];
            
            if (bridge.size() < bridge_length &&
                    totalWeight + nextTruck <= weight) {
                
                bridge.offer(new Truck(nextTruck, time + bridge_length));
                totalWeight += nextTruck;
                answer = time + bridge_length;
                
                idx++;
                time++;
            } else {
                time = bridge.peek().exitTime;
            }
        }
        
        return answer;
    }
}