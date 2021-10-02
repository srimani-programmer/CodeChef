/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t != 0) {
            long N, A, B;
            N = sc.nextLong();
            A = sc.nextLong();
            B = sc.nextLong();
            String journey = sc.next();
            long totalTimeCount = 0;

            for (int i = 0; i < N; i++) {
                if (journey.charAt(i) == '0')
                    totalTimeCount += A;
                else if (journey.charAt(i) == '1')
                    totalTimeCount += B;
            }

            System.out.println(totalTimeCount);
            t--;
            sc.close();
        }

    }
}
