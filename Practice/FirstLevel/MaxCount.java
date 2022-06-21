import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Map<Integer, Integer> frequency = new HashMap<>();

            for(Integer value: arr){
                int count = frequency.containsKey(value) ? frequency.get(value) : 0;

                frequency.put(value, count + 1);
            }

            int keyEle = 0;
            int count = 0;

            for(Integer key: frequency.keySet()){
                if(frequency.get(key) > count){
                    count = frequency.get(key);
                    keyEle = key;
                }else if(frequency.get(key) ==  count){
                    if(key < keyEle){
                        count = frequency.get(key);
                        keyEle = key;
                    }
                }
            }

            System.out.println(keyEle + " " + count);

            t -= 1;
        }
    }
}
