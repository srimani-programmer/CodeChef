import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] prices = new int[n];

            int totalPrice = 0;

            for(int i=0; i<n; i++) {
                prices[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++) totalPrice += prices[i];

            int discountPrice = 0;

            for(int i=0; i<n; i++){
                if(prices[i] <= y) {
                    prices[i] = 0;
                }else {
                    discountPrice += (prices[i]  - y);
                }
            }

            if((x + discountPrice ) < totalPrice) System.out.println("COUPON");
            else System.out.println("NO COUPON");

            t -= 1;
        }
    }
}
