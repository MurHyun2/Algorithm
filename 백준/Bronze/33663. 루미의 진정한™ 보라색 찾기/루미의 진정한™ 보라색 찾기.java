import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Hlo = Integer.parseInt(st.nextToken());
        int Hhi = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int Slo = Integer.parseInt(st.nextToken());
        int Shi = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int Vlo = Integer.parseInt(st.nextToken());
        int Vhi = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int V = Math.max(R, Math.max(G, B));
        int m = Math.min(R, Math.min(G, B));

        double S = 255.0 * (V - m) / V;
        double H;

        if (V == R) {
            H = 60.0 * (G - B) / (V - m);
        } else if (V == G) {
            H = 120.0 + 60.0 * (B - R) / (V - m);
        } else {
            H = 240.0 + 60.0 * (R - G) / (V - m);
        }

        if (H < 0) H += 360.0;

        if (Hlo <= H && H <= Hhi && Slo <= S && S <= Shi && Vlo <= V && V <= Vhi) {
            System.out.println("Lumi will like it.");
        } else {
            System.out.println("Lumi will not like it.");
        }
    }
}