import java.util.Scanner;

public class Subscribe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t != 0){

            int size = sc.nextInt();
            int subscription = sc.nextInt();

            int totalGroups = (int) Math.ceil(size/6.0);

            System.out.println(totalGroups * subscription);

            t -= 1;
        }

        sc.close();
    }
}
