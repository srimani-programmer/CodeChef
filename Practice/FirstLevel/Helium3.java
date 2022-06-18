public class Helium3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            System.out.println((x * y >= a * b) ? "YES" : "NO");
            t -= 1;
        }

        sc.close();
    }
}
