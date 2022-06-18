public class BatteryLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int percentage = sc.nextInt();
            
            System.out.println((percentage <= 15) ? "YES" : "NO");

            t -= 1;
        }

        sc.close();
    }
}
