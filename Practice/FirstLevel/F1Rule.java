public class F1Rule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            double f1Requirement = x + (x * 0.07);

            if(y <= f1Requirement) System.out.println("YES");
            else System.out.println("NO");

            t -= 1;
        }

        sc.close();
    }
}
