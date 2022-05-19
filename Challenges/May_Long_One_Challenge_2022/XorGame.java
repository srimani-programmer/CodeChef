// package Challenges.May_Long_One_Challenge_2022;

import java.util.Scanner;

public class XorGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int N = sc.nextInt();

            int[] arr = new int[N];

            for(int i=0; i<N; i++) arr[i] = sc.nextInt();

            int queries = sc.nextInt();

            while(queries != 0){

                int L = sc.nextInt();
                int R = sc.nextInt();
                int X = sc.nextInt();
                int result = 0;
                for(int i=L - 1; i < R; i++){
                    if((arr[i] ^ X) > (arr[i] & X)) result++;
                }

                System.out.println(result);

                queries -= 1;
            }

            t -= 1;
        }
    }
    
}
