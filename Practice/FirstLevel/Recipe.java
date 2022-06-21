import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            int gcdValue = arr[0];

            for(int i=1; i<n; i++){
                gcdValue = gcd(gcdValue, arr[i]);
            }

            for(int i=0; i<n; i++){
                System.out.print(arr[i] / gcdValue + " ");
            }

            System.out.println();
            t -= 1;
        }
    }

    public static int gcd(int a, int b){
        if(a == 0) return b;

        return gcd(b % a, a);
    }
}
