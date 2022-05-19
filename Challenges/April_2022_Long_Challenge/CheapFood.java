package Challenges.April_2022_Long_Challenge;

import java.util.Scanner;

public class CheapFood {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0){
            int billAmount = sc.nextInt();
            double cashBack = billAmount * 0.10;

            if(cashBack >= 100) System.out.printf("%.0f\n", cashBack);
            else System.out.println(100);

            t -= 1;
        }
    }
    
}
