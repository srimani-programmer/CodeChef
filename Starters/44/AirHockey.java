public class AirHockey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x >= y ? 7 - x : 7 - y);

            t -= 1;
        }
    }
}
