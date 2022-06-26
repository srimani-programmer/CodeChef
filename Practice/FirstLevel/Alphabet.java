import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int t = sc.nextInt();

        while(t != 0){

            String word = sc.next();

            Boolean flag = true;

            for(int i=0; i<word.length(); i++){
                if(!s.contains(word.charAt(i) + "".trim())){
                    flag = false;
                    System.out.println("NO");
                    break;
                }
            }

            if(flag) System.out.println("YES");

            t -= 1;
        }
    }
}
