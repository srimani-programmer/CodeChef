import java.util.Scanner;

public class Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int aliceChoclates = sc.nextInt();
            int bobChoclates = sc.nextInt();
            

            if(((aliceChoclates + bobChoclates) & 1) == 0) System.out.println("YES");
            else System.out.println("NO");

            t -= 1;
        }

        sc.close();
    }
}
