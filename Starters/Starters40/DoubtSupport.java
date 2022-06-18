import java.util.Scanner;

public class DoubtSupport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int difficultyLevel = sc.nextInt();

        if(difficultyLevel <= 1600){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}