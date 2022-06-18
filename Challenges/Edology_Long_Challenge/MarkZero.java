import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarkZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>(n);

            for(int i=0; i<n; i++) list.add(sc.nextInt());

            int maxElement = Collections.max(list);

            int powerIndex = 0;
            double powerValue = 0.0;
            int result = 0;
            boolean flag = true;

            while(maxElement != 0){

                powerValue = Math.pow(2, powerIndex);
                flag = true;

                if(powerValue > maxElement){
                    powerValue = Math.pow(2, powerIndex - 1);
                    maxElement = (int) (maxElement - powerValue);
                    if(powerIndex - 1 == 0) result += 1;
                    else result += (powerIndex - 1);
                    powerIndex = 0;
                    powerValue = 0;
                    flag = false;
                }

                if(flag){
                 powerIndex++;
                }
            }

            System.out.println(result);

            t -= 1;
        }
    }
}
