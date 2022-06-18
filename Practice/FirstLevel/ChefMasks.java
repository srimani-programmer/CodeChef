public class ChefMasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int disposable = x * 100;
            int cloth = y * 10;

            if(disposable == cloth)
                System.out.println("Cloth");
            else if(cloth > disposable)
                System.out.println("Disposable");
            else
                System.out.println("Cloth");
                
            t -= 1;
        }
        

        sc.close();
    }
}
