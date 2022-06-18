import java.util.Scanner;

public class AppleOrangePurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a + b <= x) ? "YES" : "NO");

        sc.close();
    }
}
