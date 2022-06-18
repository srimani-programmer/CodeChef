import java.util.Scanner;

public class SixFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int doubleBedRoomPrice = sc.nextInt();
            int tripleBedRoomPrice = sc.nextInt();

            System.out.println((doubleBedRoomPrice * 3 > tripleBedRoomPrice * 2) ? tripleBedRoomPrice * 2 : doubleBedRoomPrice * 3);

            t -= 1;
        }
        

        sc.close();
    }
}
