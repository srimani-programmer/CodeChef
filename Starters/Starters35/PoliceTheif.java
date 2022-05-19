package Starters.Starters35;

import java.util.Scanner;

public class PoliceTheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int policeTime = sc.nextInt();
            int theifTime = sc.nextInt();

            int totalTime = 0;

            while(policeTime != theifTime){

                if(policeTime < theifTime){
                    policeTime += 2;
                    theifTime += 1;
                    totalTime += 1;
                }else if(theifTime < policeTime){
                    if(policeTime - 2 <= theifTime + 1){
                        theifTime += 1;
                        totalTime += 1;
                    }else {
                        policeTime -= 2;
                        theifTime += 1;
                        totalTime += 1;
                    }
                }
            }
            System.out.println(totalTime);
            t -= 1;
        }
    }
}
