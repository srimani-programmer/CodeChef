import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            Map<Character, Integer> frequencyMap = new HashMap<>();

            for(int i=0; i<n; i++){
                if(a.charAt(i) != b.charAt(i)){
                    int count = frequencyMap.containsKey(b.charAt(i)) ? frequencyMap.get(b.charAt(i)) : 0;
                    frequencyMap.put(b.charAt(i), count + 1);
                }
            }

            System.out.println(frequencyMap.size());

            t -= 1;
        }
    }
}
