import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int N = sc.nextInt();

            int []arr1 = new int[N];
            int []arr2 = new int[N];

            for(int i=0; i<N; i++) arr1[i] = sc.nextInt();

            for(int i=0; i<N; i++) arr2[i] = sc.nextInt();

            int count = 0;

            for(int i=0; i<arr1.length; i++){
                for(int j=i+1; j<arr2.length; j++){
                    if(i < j && arr1[i] == arr2[j] && arr1[j] == arr2[i]) count += 1;
                }
            }

            System.out.println(count);
            // getGoodPairs(arr1, arr2, 0, 1, 0);

            // System.out.println(result);
 
            t -= 1;
        }
    }

    // static void getGoodPairs(int[]  arr1, int[] arr2, int firstIndex, int secondIndex, int count){
        
    //     if(firstIndex > arr1.length - 2){
    //         System.out.println(count);
    //         return;
    //     }

    //     if(secondIndex == arr2.length - 1){
    //         if(firstIndex + 2 > arr2.length - 1) return;
    //         else getGoodPairs(arr1, arr2, firstIndex + 1, firstIndex + 2, count);
    //     }

    //     // if(firstIndex > arr1.length - 1 || secondIndex > arr2.length - 1) return;

    //     if(firstIndex <= arr1.length - 1 && secondIndex <= arr2.length - 1){
    //         if(firstIndex < secondIndex && (arr1[firstIndex] == arr2[secondIndex]) && (arr1[secondIndex] == arr2[firstIndex])){
    //             count += 1;
    //             //count = getGoodPairs(arr1, arr2, firstIndex, secondIndex + 1, count);
    //         }
    //     }else return;
        
    //     // System.out.println("First Index: " + firstIndex);
    //     // System.out.println("Second Index: " + secondIndex);
    //     // System.out.println("Count: " + count);

    //     getGoodPairs(arr1, arr2, firstIndex, secondIndex + 1, count);
    // }
}
