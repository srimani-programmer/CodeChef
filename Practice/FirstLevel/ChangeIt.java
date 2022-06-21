import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChangeIt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Map<Integer, Integer> frequency = new HashMap<>();

            for(int i=0; i<n; i++){
                int count = frequency.containsKey(arr[i]) ? frequency.get(arr[i]) : 0;
                frequency.put(arr[i], count + 1);
            }

            int max = -1;

            for(Integer value: frequency.values()){
                if(max < value) max = value;
            }

            System.out.println(n - max);
            t -= 1;
        }
    }
}