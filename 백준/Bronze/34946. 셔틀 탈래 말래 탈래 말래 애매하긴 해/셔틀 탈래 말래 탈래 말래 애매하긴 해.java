import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); 
        int B = sc.nextInt();
        int C = sc.nextInt(); 
        int D = sc.nextInt();

        boolean canShuttle = (A + B) <= D;
        boolean canWalk = C <= D;

        if (canShuttle && canWalk) {
            System.out.println("~.~");
        } else if (!canShuttle && !canWalk) {
            System.out.println("T.T");
        } else if (canShuttle) {
            System.out.println("Shuttle");
        } else {
            System.out.println("Walk");
        }
    }
}
