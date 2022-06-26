import java.util.Scanner;

public class Jogging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            long caloriesBurnt = 0;

            for(int i=1; i<=n; i++){
                if(i > 1){
                    caloriesBurnt += caloriesBurnt;
                }else{
                    caloriesBurnt += x;
                }
            }

            System.out.println(caloriesBurnt % 1000000007);

            t -= 1;
        }
    }
}
