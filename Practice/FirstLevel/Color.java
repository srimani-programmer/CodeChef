import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            String s = sc.next();

            Map<Character, Integer> colors = new HashMap<>();

            for(int i=0; i<s.length(); i++){
                int count = colors.containsKey(s.charAt(i)) ? colors.get(s.charAt(i)) : 0;
                colors.put(s.charAt(i), count + 1);
            }

            int maxSameColorRooms = -1;

            for(Character color : colors.keySet()){
                if(colors.get(color) > maxSameColorRooms){
                    maxSameColorRooms = colors.get(color);
                }
            }

            System.out.println(n - maxSameColorRooms);

            t -= 1;
        }
    }
}
