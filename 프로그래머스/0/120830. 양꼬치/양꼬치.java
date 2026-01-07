class Solution {
    public int solution(int n, int k) {
        int meatPrice = n * 12000;
        int drinkPrice = k * 2000;
        int freeDrink = n / 10;
        
        return meatPrice + drinkPrice - (freeDrink * 2000);
    }
}