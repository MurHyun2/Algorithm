import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        
        permutation("", numbers);
        
        int answer = 0;
        
        for (int i : set) {
            if (isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private void permutation(String curr, String numbers) {
        if (!curr.equals("")) {
            set.add(Integer.parseInt(curr));
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation(curr + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}