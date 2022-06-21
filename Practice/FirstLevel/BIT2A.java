import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BIT2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Map<Integer, Integer> frequency = new HashMap<>();

            for(Integer value : arr){
                int count = frequency.containsKey(value) ? frequency.get(value) : 0;
                frequency.put(value, count + 1);
            }
           // System.out.println(frequency);
            int[] b = new int[n];
            Arrays.fill(b, 0);
            
            int previousFrequencyCount = 0;
            int prevNumber = -1;
            for(int i=0; i<n; i++){
                if(prevNumber != arr[i]){
                    int freq = frequency.get(arr[i]);
                    int count = n - freq - previousFrequencyCount;
                
                    if(count >= 0) b[i] = count;

                    previousFrequencyCount += freq;
                }
                
                prevNumber = arr[i];
            }
            

            for(Integer ele: b)
                System.out.print(ele + " ");

            System.out.println();

            t -= 1;
        }
    }
}
