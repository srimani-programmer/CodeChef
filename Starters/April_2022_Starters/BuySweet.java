package Starters.April_2022_Starters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SweetPrice {
    public int price;
    public int cashBack;

    SweetPrice(int price, int cashBack){
        this.price = price;
        this.cashBack = cashBack;
    }
}

public class BuySweet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t != 0){
            int N, R;
            N = sc.nextInt();
            R = sc.nextInt();

            int []sweets = new int[N];
            int []cashBack = new int[N];

            for(int i=0; i<N; i++) sweets[i] = sc.nextInt();

            for(int i=0; i<N; i++) cashBack[i] = sc.nextInt();

            List<SweetPrice> prices = new ArrayList<>();

            for(int i=0; i<N; i++){
                prices.add(new SweetPrice(sweets[i], cashBack[i]));
            }

            Comparator sweetComparator = new Comparator<SweetPrice>() {
               
                @Override
                public int compare(SweetPrice s1, SweetPrice s2) {
                    if(s1.cashBack > s2.cashBack) return -1;
                    else if(s1.cashBack < s2.cashBack) return 1;

                    return 0;
                }
            };

            Collections.sort(prices, sweetComparator);

            // for(SweetPrice sp : prices){
            //     System.out.println(sp.price + " " + sp.cashBack);
            // }
            int i=0;
            int maxSweets = 0;

            while(i < N){

                while(R >= prices.get(i).price){
                    R = R - prices.get(i).price;
                    R = R + prices.get(i).cashBack;
                    maxSweets += 1;
                }
                i++;
            }

            System.out.println(maxSweets);
            
            t -= 1;
        }
    }
}
