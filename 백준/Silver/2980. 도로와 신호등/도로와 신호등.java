import java.util.*;
import java.io.*;

class Main {
    // N은 신호등 개수 1 ~ 100, L은 도로의 길이 1 ~ 1,000
    // D는 신호등 위치, R은 빨간불 시간 1 ~ 100, G는 초록불 시간 1 ~ 100. 신호등은 겹치지 않음
    // 트럭은 1초에 1미터 진행. 단순 구현 문제인거 같음.
    // 트럭이 출발하면 각 신호등이 1초당 상태를 업데이트 해서 시간이 넘어가면 r -> g -> r 반복되게 하면 될듯

    static class trafficLight {
        int r;
        int g;
        int time;
        int status;

        trafficLight(int r, int g, int time, int status) {
            this.r = r;
            this.g = g;
            this.time = time;
            this.status = status;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        Map<Integer, trafficLight> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            map.put(d, new trafficLight(r, g, 0, 0));
        }

        //입력 끝
        int time = 0;
        int length = 0;
        while (length < l) {
            if (!(map.containsKey(length) && map.get(length).status == 0)) {
                length++;
            }

            for (trafficLight t : map.values()) {
                t.time++;
                if(t.time == t.r && t.status == 0) {
                    t.status = 1;
                    t.time = 0;
                } else if (t.time == t.g && t.status == 1) {
                    t.status = 0;
                    t.time = 0;
                }
            }

            time++;
        }

        System.out.println(time);
    }
}