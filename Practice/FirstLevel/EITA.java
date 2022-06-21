public class EITA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int d= sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int firstApproach = x * 7;
            int secondApproach = (y * d) + ((7 - d) * z);

            System.out.println(Math.max(firstApproach, secondApproach));


            t -= 1;
        }
    }
}
