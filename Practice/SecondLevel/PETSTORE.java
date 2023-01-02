import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PETSTORE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while(t != 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Map<Integer, Integer> freq = new HashMap<>();

            for(int i=0; i<n; i++){
                int value = freq.containsKey(arr[i]) ? freq.get(arr[i]) : 0;
                freq.put(arr[i], value + 1);
            }

            boolean isSameSet = true;

            for(Integer values : freq.values()){
                if((values & 1) == 1){
                    isSameSet = false;
                    break;
                }
            }

            if(isSameSet){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



            t -= 1;
        }

        sc.close();
    }
}