import java.util.Arrays;
import java.util.Scanner;

public class Holidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int w = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);
            int count = 0;
            int earning = 0;
            for(int i=arr.length-1; i>=0; i--){
                earning += arr[i];
                count+=1;
                if(earning >= w) break;
            }

            System.out.println(n - count);

            t -= 1;
        }
    }
}
