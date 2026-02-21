import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Deque<Character> deque = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (!deque.isEmpty() && deque.peekLast() == c) {
                deque.pollLast();
            } else {
                deque.offerLast(c);
            }
        }

        return deque.isEmpty() ? 1 : 0;
    }
}