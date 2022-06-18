import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            System.out.println((m - k >= n) ? "YES" : "NO");
            t -= 1;
        }

        sc.close();
    }
}
