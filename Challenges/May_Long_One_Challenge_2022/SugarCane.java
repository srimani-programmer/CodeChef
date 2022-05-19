import java.util.Scanner;

public class SugarCane{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int N = sc.nextInt();

            int totalCoins = N * 50;

            int profit = (int) (totalCoins - (totalCoins * 0.7));

            System.out.println(profit);

            t -= 1;
        }
    }
}