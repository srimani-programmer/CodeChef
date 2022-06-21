import java.util.Scanner;

public class Tyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int tyres = sc.nextInt();

            System.out.println(tyres % 4 >= 2 ? "YES" : "NO");


            t -= 1;
        }
    }
}
