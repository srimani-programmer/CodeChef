public class Tyre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int m = sc.nextInt();
            
            System.out.println((n * 2) + (m * 4));
                
            t -= 1;
        }
        

        sc.close();
    }
}
