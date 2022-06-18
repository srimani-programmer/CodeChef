public class JCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();
            int y = sc.nextInt();


            System.out.println((x * 5) + (y * 10));
            t -= 1;
        }

        sc.close();
    }
}
