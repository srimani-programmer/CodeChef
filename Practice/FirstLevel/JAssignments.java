public class JAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int x = sc.nextInt();

            System.out.println((x + 3 <= 10) ? "YES" : "NO");
            t -= 1;
        }

        sc.close();
    }
}
