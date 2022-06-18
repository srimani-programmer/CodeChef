public class IncreaseIQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iq = sc.nextInt();

        System.out.println((iq + 7 > 170) ? "YES" : "NO");

        sc.close();
    }
}
