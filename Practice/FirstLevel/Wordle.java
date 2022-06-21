import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            String hidden = sc.next();
            String guess = sc.next();

            String finalWord = "";

            for(int i=0; i<hidden.length(); i++){
                if(hidden.charAt(i) == guess.charAt(i)) finalWord += "G";
                else finalWord += "B";
            }

            System.out.println(finalWord);


            t -= 1;
        }
    }
}
