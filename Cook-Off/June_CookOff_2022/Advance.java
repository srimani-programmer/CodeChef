import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int max = x + 200;

            if(y <= max && y >= x) System.out.println("Yes");
            else System.out.println("No");

            t -= 1;
        }
    }
}