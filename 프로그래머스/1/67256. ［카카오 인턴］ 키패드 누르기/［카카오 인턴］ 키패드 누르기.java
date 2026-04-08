class Solution {
    public String solution(int[] numbers, String hand) {
        int ln = 10;
        int rn = 12;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n == 0) n = 11;
            if (n % 3 == 1) {
                sb.append("L");
                ln = n;
            } else if (n % 3 == 0) {
                sb.append("R");
                rn = n;
            } else {
                int left = ln;
                int right = rn;
                int leftDist = 0;
                int rightDist = 0;
                
                while (left != n) {
                    if (left > n) {
                        if (left - 3 >= n) {
                            left -= 3;
                            leftDist++;
                        } else {
                            left++;
                            leftDist++;
                        }
                    } else {
                        if (left + 3 <= n) {
                            left += 3;
                            leftDist++;
                        } else {
                            left++;
                            leftDist++;
                        }                        
                    }
                }
                
                while (right != n) {
                    if (right > n) {
                        if (right - 3 >= n) {
                            right -= 3;
                            rightDist++;
                        } else {
                            right--;
                            rightDist++;
                        }
                    } else {
                        if (right + 3 <= n) {
                            right += 3;
                            rightDist++;
                        } else {
                            right--;
                            rightDist++;
                        }                        
                    }
                }
                
                if (leftDist == rightDist) {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rn = n;
                    } else {
                        sb.append("L");
                        ln = n;
                    }
                } else if (leftDist > rightDist) {
                    sb.append("R");
                    rn = n;
                } else {
                    sb.append("L");
                    ln = n;
                }
            }
        }
        
        return sb.toString();
    }
}