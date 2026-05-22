import java.util.*;

class Solution {
    static class Event {
        String command;
        String uid;
        
        Event(String command, String uid) {
            this.command = command;
            this.uid = uid;
        }
    }
    
    
    public String[] solution(String[] record) {
        Map<String, String> nicknameMap = new HashMap<>();
        List<Event> events = new ArrayList<>();
        
        for (String pick : record) {
            String[] cur = pick.split(" ");
            
            String command = cur[0];
            String uid = cur[1];
            
            if ("Enter".equals(command)) {
                nicknameMap.put(uid, cur[2]);
                events.add(new Event(command, uid));
            } 
            else if ("Leave".equals(command)) {
                events.add(new Event(command, uid));
            } 
            else if ("Change".equals(command)) {
                nicknameMap.put(uid, cur[2]);
            }
        }
        
        String[] answer = new String[events.size()];
        
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            String nickname = nicknameMap.get(event.uid);
            
            if ("Enter".equals(event.command)) {
                answer[i] = nickname + "님이 들어왔습니다.";
            } 
            else if ("Leave".equals(event.command)) {
                answer[i] = nickname + "님이 나갔습니다.";
            } 
        }
        
        return answer;
    }
}

/*
Enter와 Change 기록을 기준으로 uid별 최종 닉네임을 저장한다.
이후 record를 다시 순회하면서 Change를 제외한 Enter/Leave 기록만
최종 닉네임 기준으로 메시지로 변환한다.
*/