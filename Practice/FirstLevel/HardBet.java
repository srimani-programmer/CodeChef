import java.util.Scanner;

public class HardBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int sA = sc.nextInt();
            int sB = sc.nextInt();
            int sC = sc.nextInt();

            if(sC < sA && sC < sB) System.out.println("Alice");
            else if(sB < sC && sB < sA) System.out.println("Bob");
            else System.out.println("Draw");

            t -= 1;
        }
    }
}