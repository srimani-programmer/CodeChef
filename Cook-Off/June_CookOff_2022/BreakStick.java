import java.util.Scanner;

public class BreakStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int stick = sc.nextInt();
            int length = sc.nextInt();

            if(stick%2 == 0 && length%2 == 1 && length != 1){
                System.out.println("No");
            }else{

            }

            t -= 1;
        }
    }
}
