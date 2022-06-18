import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int Pa = sc.nextInt();
            int Pb = sc.nextInt();
            int Qa = sc.nextInt();
            int Qb = sc.nextInt();

            int maxTimeP = Pa > Pb ? Pa : Pb;
            int maxTimeQ = Qa > Qb ? Qa : Qb;

            if(maxTimeP > maxTimeQ){
                System.out.println("Q");
            }else if(maxTimeQ > maxTimeP){
                System.out.println("P");
            }else{
                System.out.println("TIE");
            }


            t -= 1;
        }
    }
}
