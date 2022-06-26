import java.util.Scanner;

public class Dense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            String s = sc.next();

            int count = 0;
            int lbcount = 0;
            int rbcount = 0;


            if((n&1) == 0){
                int mid = (n / 2) - 1;

                for(int i=0; i<=mid; i++){
                    if(s.charAt(i) == ')') count+= 1;
                    else lbcount += 1;
                }

                for(int i=mid+1; i<n; i++){
                    if(s.charAt(i) == '(') count += 1;
                    else rbcount += 1;
                }

                if(lbcount == rbcount){
                    System.out.println(count);
                }else{
                    if(lbcount > rbcount){
                        System.out.println(count + (lbcount - rbcount));
                    }else{
                        System.out.println(count + (rbcount - lbcount));
                    }
                }
            }else{
                int mid = (n / 2);
                
                for(int i=0; i<mid; i++){
                    if(s.charAt(i) == ')') count += 1;
                    else lbcount += 1;
                }

                for(int i=mid+1; i<n; i++){
                    if(s.charAt(i) == '(') count += 1;
                    else rbcount += 1;
                }

                if(lbcount == rbcount){
                    System.out.println(count + 1);
                }else{
                    if(lbcount > rbcount && s.charAt(mid) == '('){
                        // if(lbcount + 1 == rbcount){
                        //     System.out.println(count);
                        // }else{
                        System.out.println(count + (lbcount - rbcount) + 1);
                        // }
                    }else if(lbcount > rbcount && s.charAt(mid) == ')'){
                        if(lbcount == rbcount + 1){
                            System.out.println(count);
                        }else{
                            System.out.println(count + (rbcount - lbcount) + 1);
                        }
                    }else if(rbcount > lbcount && s.charAt(mid) == ')'){
                        System.out.println(count + (rbcount - lbcount) + 1);
                    }else if(rbcount > lbcount && s.charAt(mid) == '('){
                        if(rbcount == lbcount+1) System.out.println(count);
                        else{
                            System.out.println(count + (rbcount - lbcount + 1));
                        }
                    }
                }

            }

            t -= 1;
        }
    }
}
