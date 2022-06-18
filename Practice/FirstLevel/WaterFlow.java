import java.util.Scanner;

public class WaterFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int incomingWater = y * z;
            int emptySpace = x - w;
            
            if(emptySpace == incomingWater) System.out.println("filled");
            else if(incomingWater > emptySpace) System.out.println("overFlow");
            else if(incomingWater < emptySpace) System.out.println("Unfilled");

            t -= 1;
        }

        sc.close();
    }
}
