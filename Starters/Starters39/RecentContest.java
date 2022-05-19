import java.util.Scanner;

public class RecentContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();

            String[] contestProblemsList = new String[n];

            for(int i=0; i<n; i++) contestProblemsList[i] = sc.next();
            int starters = 0, ltime = 0;

            for(String contest: contestProblemsList){
                if(contest.equals("START38")) starters++;
                else if(contest.equals("LTIME108")) ltime++;
            }

            System.out.println(starters + " " + ltime);

            t -= 1;
        }
    }
}
