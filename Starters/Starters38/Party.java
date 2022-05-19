import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int totalNumberOfFriends = sc.nextInt();

            int burgerCost = sc.nextInt();

            int totalAvailableAmount = sc.nextInt();

            if(totalNumberOfFriends * burgerCost <= totalAvailableAmount) System.out.println("YES");
            else System.out.println("NO");

            t -= 1;
        }
    }
}
