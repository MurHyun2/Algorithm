import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int node;
        int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static ArrayList<Node>[] graph;
    static int[] dist;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        dist = new int[N + 1];

        Arrays.fill(dist, INF);

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(w, 1));
        }

        dijkstra(X);

        boolean isExist = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (dist[i] == K) {
                sb.append(i).append("\n");
                isExist = true;
            }
        }

        if(!isExist) {
            sb.append(-1);
        }

        System.out.println(sb);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });

        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (dist[now.node] < now.cost) {
                continue;
            }

            for (Node next : graph[now.node]) {
                int nextCost = dist[now.node] + next.cost;
                if (dist[next.node] > nextCost) {
                    dist[next.node] = nextCost;
                    pq.offer(new Node(next.node, nextCost));
                }
            }
        }
    }
}