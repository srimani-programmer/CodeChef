import java.util.Scanner;

public class Burgers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int patties = sc.nextInt();
            int buns = sc.nextInt();

            System.out.println(Math.min(patties, buns));

            t -= 1;
        }
    }
}