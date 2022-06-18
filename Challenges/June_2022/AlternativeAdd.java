import java.util.Scanner;

public class AlternativeAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t != 0){

            int a = sc.nextInt();
            int b = sc.nextInt();

            int diff = b - a;
            double divisor = diff / 2.0;
            System.out.println("Diff: " + diff + " Divisor: " + divisor);
            int finalValue =(int) (divisor * 2);

            System.out.println("Final Value: " + finalValue);

            if(finalValue + a == b) System.out.println("Yes");
            else System.out.println("No");

            // int i = 1;
            // boolean flag = false;

            // while(true){
            //     if((i&1) == 1){
            //         a += 1;
            //     }else{
            //         a += 2;
            //     }
            //     i++;
            //     if(a == b) {
            //         flag = true;
            //         break;
            //     }
            //     else if(a < b) continue;
            //     else if(a > b) break;
            // }

            // if(flag) System.out.println("Yes");
            // else System.out.println("No");

            t -= 1;
        }

        sc.close();
    }
}


/*
 * 1 ->  1 
 * 2 ->  3
 * 3 ->  4
 * 4 ->  6
 * 5 ->  7
 * 6 ->  9
 * 7 ->  10
 * 8 ->  12
 * 9 ->  13
 * 10 -> 15
 * 
 * 11 -> 16
 * 12 -> 18
 * 13 -> 19
 * 14 -> 21
 * 15 -> 22
 * 16 -> 24
 * 17 -> 25
 * 18 -> 27
 * 19 -> 28
 * 20 -> 30
 */