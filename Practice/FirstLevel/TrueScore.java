public class TrueScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println((c >= a && d >= b) ? "YES" : "NO");
            t -= 1;
        }

        sc.close();
    }
}
