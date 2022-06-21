import java.util.Scanner;

public class PROC18A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            int j=0;
            int identityPointer = 0;

            int prefixSum = 0;
            int maxImpress = prefixSum;

            for(int i=0; i<n; i++){
                if(identityPointer < k){
                    prefixSum += arr[i];
                    identityPointer++;
                }else{
                    prefixSum -= arr[j];
                    j++;
                    prefixSum += arr[i];
                   // identityPointer = 1;
                   if(prefixSum > maxImpress) maxImpress = prefixSum;

                }

                if(prefixSum > maxImpress) maxImpress = prefixSum;

            }

            System.out.println(maxImpress);

            t -= 1;
        }
    }
}
