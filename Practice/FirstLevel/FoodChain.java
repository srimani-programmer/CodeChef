import java.util.Scanner;

public class FoodChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0){
            int E = sc.nextInt();
            int K = sc.nextInt();

            int count = 0;
            while(E != 0){
                count += 1;
                E = Math.floorDiv(E, K);
            }

            System.out.println(count);

            t -= 1;
        }
    }
}
