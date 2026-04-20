class Solution {
    public int solution(int[] topping) {
        int[] left = new int[10001];
        int[] right = new int[10001];
        
        int leftKinds = 0;
        int rightKinds = 0;
        int count = 0;;
        
        for (int t : topping) {
            if (right[t] == 0) {
                rightKinds++;
            }
            right[t]++;
        }
        
        for (int t : topping) {
            if (left[t] == 0) {
                leftKinds++;
            }
            left[t]++;
            
            right[t]--;
            if(right[t] == 0) {
                rightKinds--;
            }
            
            if(leftKinds == rightKinds) {
                count++;
            }
        }
        
        return count;
    }
}

/**
조각의 크기와 토핑의 개수와 종류에 상관없이 동일한 가짓수의 토핑이 올라가면 공평함.
(예: 1,2,4(3) / 1,5,3(3) => 공평)
공평하게 나눌 수 있는 방법의 수 리턴.
1 ≤ topping의 길이 ≤ 1,000,000
1 ≤ topping의 원소 ≤ 10,000
앞에서부터 한번씩 잘라가면서 종류 개수 비교
*/