import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine());
        int leng = 64;
        int cur = 64;
        int ans = 1;
        
        if(X == 64)
            bw.write("1");
        else{
            
            while(true){
                
                cur /= 2;
                leng -= cur;
                
                if(leng < X){
                    leng += cur;
                    ans++;	
                }else if(leng == X){
                    break;
                }
            }
            bw.write(ans + "");	
            
        }
        bw.flush();
    }
}