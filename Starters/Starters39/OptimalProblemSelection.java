import java.util.Scanner;

public class OptimalProblemSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int problemA = 1500 - ((A * 2) + (B + A) * 4);
            int problemB = 1500 - ((B * 4) + ((B + A) * 2));

            System.out.println(Math.max(problemA, problemB));
            t -= 1;
        }
    }
}
