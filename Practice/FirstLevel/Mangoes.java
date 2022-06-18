import java.util.Scanner;

public class Mangoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int mangoWeight = sc.nextInt();
            int truckWeight = sc.nextInt();
            int bridgeCapacity = sc.nextInt();
            
            int finalMangoesWeight = (bridgeCapacity - truckWeight) / mangoWeight;
            
            System.out.println(finalMangoesWeight);

            t -= 1;
        }

        sc.close();
    }
}
