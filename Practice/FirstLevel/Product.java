import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int b = sc.nextInt();
            int c = sc.nextInt();

            int lcmValue = lcm(b, c);

            System.out.println((b * lcmValue) / c );
            t -= 1;
        }
    }

    public static int gcd(int a, int b){

        if(a == 0) return b;

        return gcd(b % a, a);
    }

    public static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }
}
