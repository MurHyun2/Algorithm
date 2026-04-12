import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        Map<String, Integer> cmdMap = new HashMap<>();
        cmdMap.put("next", 10);
        cmdMap.put("prev", -10);
        
        int videoLen = timeToSec(video_len);
        int curTime = timeToSec(pos);
        int opStart = timeToSec(op_start);
        int opEnd = timeToSec(op_end);
        
        if (curTime >= opStart && curTime <= opEnd) {
            curTime = opEnd;
        }
        
        for (String cmd : commands) {
            int moveSec = cmdMap.getOrDefault(cmd, 0);
            curTime += moveSec;
            
            if (curTime < 0) curTime = 0;
            if (curTime > videoLen) curTime = videoLen;
            if (curTime >= opStart && curTime <= opEnd) {
                curTime = opEnd;
            }
        }
        
        int min = curTime / 60;
        int sec = curTime % 60;
        
        return String.format("%02d:%02d", min, sec);
    }
    
    private int timeToSec(String str) {
        String[] time = str.split(":");
        int sec = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);
        return sec;
    }
}

/*
prev -> 10초전 최소 0초
next -> 10초후 최대 마지막
오프닝 구간이면 -> op_start <= 현재 <= op_end 일시 op_end 로

video_len : 동영상 길이
pos : 현재 위치

오프닝 구간 체크
for (commands) {
    nextTime += (next, prev)
    if (nextTime 조건) {
        조건에 맞게
    }
}
*/
