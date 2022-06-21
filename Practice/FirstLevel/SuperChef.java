public class SuperChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println((n * k < m) ? "YES" : "NO");


            t -= 1;
        }
    }
}
