public class WaterCooler1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();

            System.out.println((x * m < y) ? "YES" : "NO");
            t -= 1;
        }

        sc.close();
    }
}
