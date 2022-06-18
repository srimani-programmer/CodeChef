public class CreditScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        System.out.println(score >= 750 ? "YES" : "NO");

        sc.close();
    }
}
