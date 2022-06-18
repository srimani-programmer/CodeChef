import java.util.Scanner;

public class PrizeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println((10 * X) + (90 * Y));

            t -= 1;
        }
    }
}
