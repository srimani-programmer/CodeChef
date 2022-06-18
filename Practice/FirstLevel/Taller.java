import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A > B ? "A" : "B");

            t -= 1;
        }


        sc.close();
    }
}
