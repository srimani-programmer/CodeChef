import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int xA = sc.nextInt();
            int xB = sc.nextInt();
            int xC = sc.nextInt();

            if(xA > 50) System.out.println("A");
            else if(xB > 50) System.out.println("B");
            else if(xC > 50) System.out.println("C");
            else System.out.println("NOTA");

            t -= 1;
        }
    }
}
