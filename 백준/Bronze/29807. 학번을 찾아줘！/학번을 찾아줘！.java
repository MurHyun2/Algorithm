import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int num =0;
		int[] score = new int[5];
        
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		if (score[0]>score[2]) {
			num += (score[0]-score[2])*508;
		} else {
			num += Math.abs(score[0]-score[2])*108;
		}
		
		if (score[1] > score[3]) {
			num += (score[1]-score[3])*212;
		} else {
			num += (score[3]-score[1])*305;
		}
		
		if (score[4]>0) {
			num += score[4] * 707;
		}
		
		num *= 4763;
		
		System.out.println(num);
		
	}
}