public class Holes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0) {
            String s = sc.next();
            s = s.toUpperCase();
            int holes = 0;

            for(int i=0; i<s.length(); i++){
                switch (s.charAt(i)) {
                    case 'A': 
                        holes += 1;
                        break;
                    case 'D':
                        holes += 1;
                        break;
                    case 'O':
                        holes += 1;
                        break;
                    case 'P':
                        holes += 1;
                        break;
                    case 'R':
                        holes += 1;
                        break;
                    case 'B':
                        holes += 2;
                        break;                    
                }
            }

            System.out.println(holes);

            t -= 1;
        }
    }
}
