public class LunchTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {

            int x = sc.nextInt();

            System.out.println((x >= 1 && x <= 4) ? "YES" : "NO");

            t -= 1;
        }

        sc.close();
    }
}
