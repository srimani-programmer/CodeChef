import java.util.Scanner;

public class VolumeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(Math.abs(x - y));
            t -= 1;
        }
        

        sc.close();
    }
}
