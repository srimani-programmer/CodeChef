public class ShopChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();

            System.out.println(100 - x);
            t -= 1;
        }

        sc.close();
    }
}
