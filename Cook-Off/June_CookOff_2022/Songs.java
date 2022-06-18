import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int totalJourneyDuration= sc.nextInt();
            int totalPlayListDuration = sc.nextInt();

            System.out.printf("%.0f\n",Math.floor((totalJourneyDuration / (totalPlayListDuration  * 3))));

            t -= 1;
        }
    }
}
