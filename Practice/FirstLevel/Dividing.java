import java.util.Scanner;

public class Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int resultant = (n * (n + 1)) / 2;

        if(sum == resultant) System.out.println("YES");
        else System.out.println("NO");
    }
}
