import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenTual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {
            int n = sc.nextInt();

            String a = sc.next();

            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (int i = 0; i < n; i++) {

                int count = frequencyMap.containsKey(a.charAt(i)) ? frequencyMap.get(a.charAt(i)) : 0;
                frequencyMap.put(a.charAt(i), count + 1);

            }
            
            // System.out.println(frequencyMap);
            boolean flag = false;
            for (Integer value : frequencyMap.values()) {
                if ((value & 1) == 1) {
                    flag = true;
                    break;
                }
            }

            System.out.println(flag ? "No" : "Yes");

            t -= 1;
        }
    }
}

/**
 *  y o u r c r u s h l o v e s y o u b a c k
 * 
 */
