import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class HighScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();

            int NA = sc.nextInt();
            int NB = sc.nextInt();
            int NC = sc.nextInt();
            int ND = sc.nextInt();

            int maxMarks = Math.max(Math.max(NA, NB), Math.max(NC, ND));

            System.out.println(maxMarks);

            t -= 1;
        }
    }
}
