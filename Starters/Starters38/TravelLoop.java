import java.util.Scanner;

public class TravelLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int initalCheckPoint = sc.nextInt();
            int finalCheckPoint  = sc.nextInt();
            int bidirectionalPoint = sc.nextInt();

            int generalRoute = Math.abs(initalCheckPoint - finalCheckPoint);
            int reverseRoute = Math.abs(bidirectionalPoint - finalCheckPoint) + initalCheckPoint;

            if(generalRoute <= reverseRoute) System.out.println(generalRoute);
            else System.out.println(reverseRoute);

            t -= 1;
        }
    }
}
