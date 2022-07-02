import java.util.Scanner;

public class Fill01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int maxNaps = 0;
            int consequtiveHours = 0;

            for(int i=0; i<n; i++){
                if(s.charAt(i) == '0') consequtiveHours += 1;
                else if(s.charAt(i) == '1') consequtiveHours = 0;

                if(consequtiveHours == k){
                    maxNaps += 1;
                    consequtiveHours = 0;
                }
            }

            System.out.println(maxNaps);

            t -= 1; 
        }
    }
}
