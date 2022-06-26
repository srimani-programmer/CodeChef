import java.util.Scanner;

public class KOL15A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            String s = sc.next();

            int totalSum = 0;

            char[] sequence = s.toCharArray();

            for(Character c: sequence){
                if(Character.isDigit(c)){
                    totalSum += Integer.parseInt(c + "");
                }
            }

            System.out.println(totalSum);

            t -= 1;
        }
    }
}