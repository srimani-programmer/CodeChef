import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            // int result = 0;

            if((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3)){
                System.out.println(n1);
            }else if((n2 > n3 && n2 < n1) || (n2 > n1 && n2 < n3)){
                System.out.println(n2);
            }else {
                System.out.println(n3);
            }

            t -= 1;
        }


        sc.close();
    }
}
