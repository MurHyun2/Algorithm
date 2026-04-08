class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;
        
        StringBuilder sb = new StringBuilder();
        
        for (int number : numbers) {
            if (number == 0) number = 11;
            
            // 1, 4, 7
            if (number % 3 == 1) {
                sb.append("L");
                left = number;
            }
            // 3, 6, 9
            else if (number % 3 == 0) {
                sb.append("R");
                right = number;
            }
            // 2, 5, 8, 0
            else {
                int leftDistance = getDistance(left, number);
                int rightDistance = getDistance(right, number);
                
                if (leftDistance < rightDistance) {
                    sb.append("L");
                    left = number;
                } else if (leftDistance > rightDistance) {
                    sb.append("R");
                    right = number;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = number;
                    } else {
                        sb.append("R");
                        right = number;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private static int getDistance(int from, int to) {
        int fromRow = (from - 1) / 3;
        int fromCol = (from - 1) % 3;
        int toRow = (to - 1) / 3;
        int toCol = (to - 1) % 3;
        
        return Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);
    }
}