import java.util.*;

class Solution {
    class Job {
        int idx;
        int inputTime;
        int needTime;
        
        Job(int idx, int inputTime, int needTime) {
            this.idx = idx;
            this.inputTime = inputTime;
            this.needTime = needTime;
        }
    }
    
    public int solution(int[][] jobs) {
        
        Arrays.sort(jobs, (o1, o2) -> {
            return Integer.compare(o1[0], o2[0]);
        });
        
        PriorityQueue<Job> pq = new PriorityQueue<>(
            (o1, o2) -> {
                if (o1.needTime != o2.needTime) {
                    return Integer.compare(o1.needTime, o2.needTime);
                }

                if (o1.inputTime != o2.inputTime) {
                    return Integer.compare(o1.inputTime, o2.inputTime);
                }

                return Integer.compare(o1.idx, o2.idx);
            }
        );
        
        int n = jobs.length;
        int time = 0;
        int idx = 0;
        int completed = 0;
        long totalReturnTime = 0;
        
        while (completed < n) {
            while (idx < n && jobs[idx][0] <= time) {
                pq.offer(new Job(idx, jobs[idx][0], jobs[idx][1]));
                idx++;
            }
            
            if (pq.isEmpty()) {
                time = jobs[idx][0];
                continue;
            }
            
            Job job = pq.poll();

            time += job.needTime;
            totalReturnTime += time - job.inputTime;
            completed++;
        }
        
        return (int) (totalReturnTime / n);
    }
}

/*
1. 작업의 번호, 작업의 요청 시각, 작업의 소요 시간을 저장해 두는 대기 큐
2. 작업x, 대기큐 있다면 우선순위 순으로 꺼내서 작업
    1순위 - 작업의 소요시간이 짧은 것
    2순위 - 작업의 요청 시각이 빠른 것
    3순위 - 작업의 번호가 작은 것
3. 작업 중간 종료 없음
4. 작업 마치는 시점과 작업 요청 시간이 겹치면, 요청을 대기큐에 먼저 넣고, 우선순위 판별
    작업 마치자마자 바로 다른 작업 연달아서 실행 가능
    
반환 시간 = 작업 종료 시각 - 요청 시각
평균 반환 시간(정수) 리턴

우선순위 큐를 구현해서 우선순위 정렬 조건을 입력
for문 돌면서 0~2000까지 돌려봄
해당 시간에 요청이 있다면 우선순위큐에 넣기
매 반복마다 끝났는지 확인하기
*/