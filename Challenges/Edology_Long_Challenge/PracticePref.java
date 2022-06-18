import java.util.Scanner;

public class PracticePref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();

        int targetMet = 0;

        if(p1 >= 10) targetMet++;

        if(p2 >= 10) targetMet++;

        if(p3 >= 10) targetMet++;

        if(p4 >= 10) targetMet++;

        System.out.println(targetMet);

    }
}
