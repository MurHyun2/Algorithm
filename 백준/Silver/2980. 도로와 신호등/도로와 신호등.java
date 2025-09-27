import java.util.*;
import java.io.*;

class Main {
    // N은 신호등 개수 1 ~ 100, L은 도로의 길이 1 ~ 1,000
    // D는 신호등 위치, R은 빨간불 시간 1 ~ 100, G는 초록불 시간 1 ~ 100. 신호등은 겹치지 않음
    // 트럭은 1초에 1미터 진행. 단순 구현 문제인거 같음.
    // 트럭이 출발하면 각 신호등이 1초당 상태를 업데이트 해서 시간이 넘어가면 r -> g -> r 반복되게 하면 될듯

    static class TrafficLight {
        int r;
        int g;

        TrafficLight(int r, int g) {
            this.r = r;
            this.g = g;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        TrafficLight[] lights = new TrafficLight[l + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            lights[d] = new TrafficLight(r, g);
        }
        //입력 끝

        int time = 0;

        for (int i = 0; i < l; i++) {
            if (lights[i] != null) {
                TrafficLight tf = lights[i];
                int cycle = tf.r + tf.g;
                int mod = time % cycle;

                if (mod < tf.r) {
                    time += (tf.r - mod);
                }
            }
            time++;
        }

        System.out.println(time);
    }
}