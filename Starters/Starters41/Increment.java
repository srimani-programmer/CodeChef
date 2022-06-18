import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

           int x = sc.nextInt();
           int y = sc.nextInt();

           int count = 0;

           if(x < y){
               count = y - x;
           }else if(x == y){
               count = 0;
           }else if(x > y){
               if(x % 2 == 1 && y % 2 == 1){
                   count = (x - y) / 2;
               }else if(x % 2 == 0 && y % 2 == 0){
                   count = (x - y) / 2;
               }else {
                   count = ((x - y) / 2) + 2;
               }
           }

           System.out.println(count);

            t -= 1;
        }
    }
}
