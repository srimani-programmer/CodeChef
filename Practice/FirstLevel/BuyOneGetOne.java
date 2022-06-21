import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JWindow;

public class BuyOneGetOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            String s = sc.next();

            Map<Character, Integer> jewels = new HashMap<>();

            for(int i=0; i<s.length(); i++){
                int count = jewels.containsKey(s.charAt(i)) ? jewels.get(s.charAt(i)) : 0;
                jewels.put(s.charAt(i), count + 1);
            }

            int count = 0;

            for(Integer value : jewels.values()){
                if((value&1) == 0){
                    count += (value/2);
                }else{
                    count += (value/2) + 1;
                }
            }

            System.out.println(count);

            t -= 1;
        }
    }
}
