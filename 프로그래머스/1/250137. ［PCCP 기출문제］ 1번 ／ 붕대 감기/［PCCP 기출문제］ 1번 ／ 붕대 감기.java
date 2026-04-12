class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int castTime = bandage[0];
        int healPerSec = bandage[1];
        int extraHeal = bandage[2];

        int maxHp = health;
        int curHp = health;
        int lastAtkTime = 0;

        for (int[] attack : attacks) {
            int atkTime = attack[0];
            int dmg = attack[1];

            int healTime = atkTime - lastAtkTime - 1;

            curHp += healTime * healPerSec;
            curHp += (healTime / castTime) * extraHeal;
            if (curHp > maxHp) curHp = maxHp;

            curHp -= dmg;
            if (curHp <= 0) return -1;

            lastAtkTime = atkTime;
        }

        return curHp;
    }
}