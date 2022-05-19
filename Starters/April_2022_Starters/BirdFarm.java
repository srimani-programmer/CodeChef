package Starters.April_2022_Starters;

import java.util.*;

class BirdFarm {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while(t != 0){
            int X, Y, Z;
            X = sc.nextInt();
            Y = sc.nextInt();
            Z = sc.nextInt();

            if((Z % X == 0 ) && (Z % Y == 0)) System.out.println("ANY");
            else if(Z % X == 0) System.out.println("CHICKEN");
            else if(Z % Y == 0) System.out.println("DUCK");
            else System.out.println("NONE");

            t -= 1;
        }

    }
}