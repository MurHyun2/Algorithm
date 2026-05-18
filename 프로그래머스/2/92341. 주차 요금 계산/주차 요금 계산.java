import java.util.*;

class Solution {
    private static final int END_TIME = 23 * 60 + 59;

    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTimeMap = new HashMap<>();
        Map<String, Integer> totalTimeMap = new TreeMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");

            int time = toMinute(parts[0]);
            String carNumber = parts[1];
            String state = parts[2];

            if ("IN".equals(state)) {
                inTimeMap.put(carNumber, time);
            } else {
                int inTime = inTimeMap.get(carNumber);
                int parkingTime = time - inTime;

                totalTimeMap.put(
                    carNumber,
                    totalTimeMap.getOrDefault(carNumber, 0) + parkingTime
                );

                inTimeMap.remove(carNumber);
            }
        }

        for (Map.Entry<String, Integer> entry : inTimeMap.entrySet()) {
            String carNumber = entry.getKey();
            int inTime = entry.getValue();

            int parkingTime = END_TIME - inTime;

            totalTimeMap.put(
                carNumber,
                totalTimeMap.getOrDefault(carNumber, 0) + parkingTime
            );
        }

        int[] answer = new int[totalTimeMap.size()];
        int index = 0;

        for (int totalTime : totalTimeMap.values()) {
            answer[index++] = calculateFee(totalTime, fees);
        }

        return answer;
    }

    private int toMinute(String time) {
        String[] parts = time.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour * 60 + minute;
    }

    private int calculateFee(int totalTime, int[] fees) {
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (totalTime <= defaultTime) {
            return defaultFee;
        }

        int extraTime = totalTime - defaultTime;
        int unitCount = (extraTime + unitTime - 1) / unitTime;

        return defaultFee + unitCount * unitFee;
    }
}