class Solution {
    public int solution(int a, int b) {
        int concat = Integer.parseInt(String.valueOf(a) + b);
        long prod = 2L * a * b;

        return (concat >= prod) ? concat : (int) prod;
    }
}