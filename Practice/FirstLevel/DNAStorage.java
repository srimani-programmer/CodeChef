import java.util.Scanner;

public class DNAStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            String dnaCode = sc.next();

            String finalDNACode = "";

            for(int i=0; i<n; i=i+2){
                String dnaPart = dnaCode.substring(i, i+2);
                if(dnaPart.equals("00")) finalDNACode += "A";
                else if(dnaPart.equals("01")) finalDNACode += "T";
                else if(dnaPart.equals("10")) finalDNACode += "C";
                else if(dnaPart.equals("11")) finalDNACode += "G";
            }

            System.out.println(finalDNACode);

            t -= 1;
        }
    }
}
