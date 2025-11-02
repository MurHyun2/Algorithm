class Solution {
    public int solution(int n) {
        int nOnes = Integer.bitCount(n);
        while (true) {
            n++;
            if (nOnes == Integer.bitCount(n)) return n;
        }
    }
}