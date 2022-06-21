import java.util.Scanner;

public class UrCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().toCharArray();

        if(op.equals("+")) System.out.println(a + b);
        else if(op.equals("-")) System.out.println(a - b);
        else if(op.equals("*")) System.out.println(a * b);
        else if(op.equals("/")) System.out.println(a / (b + 0.0));
    }
}
