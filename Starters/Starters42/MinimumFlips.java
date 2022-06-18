import java.util.Scanner;

public class MinimumFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            if((n&1) == 1){
                System.out.println(-1);
                t -=1;
                continue;
            }else{
                int positiveCount = 0;
                int negativeCount = 0;

                for(int i=0; i<n; i++){
                    if(arr[i] == 1) positiveCount++;
                    else negativeCount++;
                }

                int halfValue = n / 2;
                if(positiveCount == negativeCount) System.out.println(0);
                else if(positiveCount > negativeCount) System.out.println(halfValue - negativeCount);
                else if(negativeCount > positiveCount) System.out.println(halfValue - positiveCount);
            }

            t -= 1;
        }

        sc.close();
    }
}
