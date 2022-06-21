import java.util.Scanner;

public class ChefNWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            int count = 0;
            int load = 0;
            boolean flag = true;

            for(Integer ele: arr){
                if(ele > k){
                    System.out.println(-1);
                    flag = false;
                    break;
                }else{
                    if(load + ele <= k){
                        load += ele;
                    }else if(load + ele > k){
                        count += 1;
                        load = ele;
                    }                
                }
            }

            if(flag){
                if(load <= k) count += 1;
                else count += 2;
                System.out.println(count);
            }

            t -= 1;
        }
    }
}
