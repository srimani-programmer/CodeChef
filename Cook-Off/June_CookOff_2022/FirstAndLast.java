import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            int finalMax = arr[0] + arr[n - 1];

            for(int i=0; i<n-1; i++){
                if(arr[i] + arr[i + 1] > finalMax){
                    finalMax = arr[i] + arr[i+1];
                }
            }

            System.out.println(finalMax);

            t -= 1;
        }
    }

}
