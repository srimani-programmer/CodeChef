import java.util.Scanner;

public class ChessRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0){

            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.printf("%.0f\n",Math.ceil((Y - X)/8.0)); 

            t -= 1;
        }
    }
}
