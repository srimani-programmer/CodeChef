import java.util.Scanner;

public class RatingPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t != 0){

            int n = sc.nextInt();

            int[] rating = new int[n];

            for(int i=0; i<n; i++) rating[i] = sc.nextInt();
            boolean flag = true;

            for(int i=0; i<n - 1; i++){
                if(rating[i] <= rating[i+1]) continue;
                else{
                    flag = false;
                    break;
                }
            }

            if(flag) System.out.println("Yes");
            else System.out.println("No");

            t -= 1;
        }
    }
}
