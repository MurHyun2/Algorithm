class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int castingTime = bandage[0];
        int healingPerSec = bandage[1];
        int bonusHeal = bandage[2];
        
        int endTime = attacks[attacks.length - 1][0];
        int[] attack = new int[endTime + 1];
        
        for (int[] i : attacks) {
            int time = i[0];
            int damage = i[1];
            attack[time] = damage;
        }
        
        int casting = 0;
        int hp = health;
        
        for (int i = 1; i <= endTime; i++) {
            int damage = attack[i];
            
            if (damage != 0) {
                hp -= damage;
                
                if (hp < 1) return -1;
                
                casting = 0;
                continue;
            }
            
            hp += healingPerSec;
            casting++;
            
            if (casting == castingTime) {
                hp += bonusHeal;
                casting = 0;
            }
            
            if (hp > health) hp = health;
        }
        
        return hp;
    }
}

/*
attacks 이 끝나면 종료
for ( 0 ~ attacks[attacks.length - 1][0]) {
    if (공격 체크) {
        체력 까기
        시간 초기화
        0 이면 -1 리턴
    }

        체력 + 초당 회복
        시전시간 체크++
    
    if (시전시간) {
        체력 회복
    }
    
    if (최대 체력 넘으면) {
        최대 체력까지만
    }
}
현재 체력 리턴
*/