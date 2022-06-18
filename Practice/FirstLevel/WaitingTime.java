public class WaitingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int weeks = sc.nextInt();
            int days = sc.nextInt();

            int totalDays = 7 * weeks;

            System.out.println(totalDays - days);

            t -= 1;
        }
    }
}
