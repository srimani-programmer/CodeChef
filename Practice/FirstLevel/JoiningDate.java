import java.util.Scanner;

public class JoiningDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int totalDays = (int) Math.ceil(n / 5.0);
            int currentDay = (int) Math.ceil(k / 5.0);

            System.out.println(totalDays - currentDay);

            t -= 1;
        }
    }
}
