public class CabService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int firstCabService = sc.nextInt();
            int secondCabService = sc.nextInt();

            if(firstCabService == secondCabService) System.out.println("ANY");
            else if(firstCabService > secondCabService) System.out.println("SECOND");
            else System.out.println("FIRST");
            t -= 1;
        }
        

        sc.close();
    }
}
