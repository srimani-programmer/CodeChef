import java.util.Scanner;

public class FriendMeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            if(x1 == x2) System.out.println("YES");
            else if(x1 < x2) System.out.println("NO");
            else{
                while(true){
                    int diff = x1 - x2;
                    x1 = (int) Math.ceil(x1 + (diff/2.0));
                    x2 = x2 + diff;

                    if(x1 == x2){
                        System.out.println("YES");
                        break;
                    }else if(x1 < x2){
                        System.out.println("NO");
                        break;
                    }
                }
            }

            t -= 1;
        }
    }
}
