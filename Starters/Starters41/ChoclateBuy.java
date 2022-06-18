import java.util.Scanner;

public class ChoclateBuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            System.out.println(((X * 5) + (Y * 10)) / Z);


            t -= 1;
        }
    }
}
