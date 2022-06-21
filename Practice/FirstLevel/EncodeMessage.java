import java.util.Scanner;

public class EncodeMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            String s = sc.next();

            String encodedString = "";

            for(int i=0; i<n; i+=2){
                if(i != n - 1){
                    int first = (int) s.charAt(i);
                    int second = (int) s.charAt(i + 1);
                    int encodedFirst = 122 - (25 - (122 - first));
                    int encodedSecond = 122 - (25 - (122 - second));

                    // System.out.println("First: " + (char) encodedFirst);
                    // System.out.println("Second: " + (char) encodedSecond);
                    encodedString += (char) encodedSecond;
                    encodedString += (char) encodedFirst;
                }else{
                    int item = (int) s.charAt(i);
                    int encoded = 122 - (25 - (122 - item));
                    // System.out.println("First: " + (char) encoded);
                    encodedString += (char) encoded;
                }
            }

            System.out.println(encodedString);

            t -= 1;
        }
    }
}
