import java.util.Scanner;

public class Dominant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int kingdomAArmy = sc.nextInt();
            int kingdomBArmy = sc.nextInt();
            int kingdomCArmy = sc.nextInt();

            if((kingdomAArmy > kingdomBArmy + kingdomCArmy) || (kingdomBArmy > kingdomAArmy + kingdomCArmy) || (kingdomCArmy > kingdomAArmy + kingdomBArmy)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            t -= 1;
        }
    }
}
