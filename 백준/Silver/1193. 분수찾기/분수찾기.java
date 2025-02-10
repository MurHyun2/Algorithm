import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int squareCnt = 1;
        int squareSum = 0;

        while(true){
            if(X <= squareSum + squareCnt){
                if(squareCnt % 2 == 1){
                    System.out.println((squareCnt - (X - squareSum - 1) + "/" + (X - squareSum)));
                    break;
                }else{
                    System.out.println((X - squareSum) + "/" + (squareCnt - (X - squareSum - 1)));
                    break;
                }
            }else{
                squareSum += squareCnt;
                squareCnt++;
            }
        }
    }
}