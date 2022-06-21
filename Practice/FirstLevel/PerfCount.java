import java.util.Scanner;

public class PerfCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int p = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            int half = (int) Math.floor(p * 0.50);
            int tenth = (int) Math.floor(p * 0.10);

            int cakeProblems = 0;
            int hardProblems = 0;
            boolean flag = true;
            for(int i=0; i<n; i++){
                if(arr[i] >= half) cakeProblems++;
                else if(arr[i] <= tenth) hardProblems++;

                if(cakeProblems > 1 || hardProblems > 2){
                    System.out.println("no");
                    flag = false;
                    break;
                }
            }

            if(flag){
                if(cakeProblems == 1 && hardProblems == 2) System.out.println("yes");
                else System.out.println("no");
            }

            t -= 1;
        }
    }
}
