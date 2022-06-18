public class ChefChoco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println((c - x) * y);

            t -= 1;
        }

        sc.close();
    }
}
