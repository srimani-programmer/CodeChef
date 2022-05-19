package Starters.April_2022_Starters;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while(t != 0){
            long N = sc.nextLong();
            System.out.println(N / 5);

            long maxCoins = N - (N / 5);
            System.out.println(maxCoins);
            t -= 1;
        }
    }
}
