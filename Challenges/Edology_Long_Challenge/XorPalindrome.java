import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            
            String binary = sc.next();

            int disOrderCount = palindromeCheck(0, n - 1, binary, 0);

            System.out.printf("%.0f\n",Math.ceil(disOrderCount / 2.0));

            t -= 1;
        }
    }

    static int palindromeCheck(int start, int end, String binary, int disOrder){

        if(start >= end) return disOrder;

        if(binary.charAt(start) != binary.charAt(end)) {
            disOrder+=1;
        }

        disOrder = palindromeCheck(start + 1, end - 1, binary, disOrder);
    
        return disOrder;
    }
}
