import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> idIdx = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIdx.put(id_list[i], i);
        }
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportCnt = new HashMap<>();
        
        for (String rep : reportSet) {
            String[] parts = rep.split(" ");
            String reported = parts[1];
            
            reportCnt.put(reported, reportCnt.getOrDefault(reported, 0) + 1);
        }
        
        for (String rep : reportSet) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            if (reportCnt.get(reported) >= k) {
                answer[idIdx.get(reporter)]++;
            }
        }
        
        return answer;
    }
}

/*
여러번 신고 가능, 동일한 유저에 대한 신고는 1회만 > 중복 제거
누적 횟수 k번 이상일 시 정지, 신고한 유저에게 메일
유저별 메일 온 횟수 계산

HashMap<String, Integer> idIdx
Set<String> reportSet
유저별 신고 횟수 계산
사용자별 신고 확인 후 메일 정지 여부 확인
*/