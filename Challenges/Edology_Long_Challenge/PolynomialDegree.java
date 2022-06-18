import java.util.Scanner;

public class PolynomialDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();

            int[] polynomial = new int[n];

            for(int i=0; i<n; i++) polynomial[i] = sc.nextInt();

            int highestDegree = 0;

            for(int i=0; i<n; i++){
                if(polynomial[i] != 0) highestDegree = i;
            }

            System.out.println(highestDegree);

            t -= 1;
        }
    }
}
