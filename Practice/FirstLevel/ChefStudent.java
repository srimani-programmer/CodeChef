import java.util.Scanner;

public class ChefStudent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            String s = sc.next();
            int batch = 0;
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i) == '<' && s.charAt(i + 1) == '>') batch += 1;
            }

            System.out.println(batch);

            t -= 1;
        }
    }
}