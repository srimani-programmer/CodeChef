import java.util.Scanner;

public class WhatsappMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int Y = sc.nextInt();
            int X = sc.nextInt();
            int Z = sc.nextInt();

            System.out.println((Y * Z) - (X * Z));
            t -= 1;
        }
    }
}
