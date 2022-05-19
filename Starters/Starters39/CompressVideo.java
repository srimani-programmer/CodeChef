// package Starters.Starters39;

import java.util.Scanner;

public class CompressVideo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            int minimumFrameCount = 0;

            if(n >= 2){
                if(arr[0] != arr[1]){
                    minimumFrameCount += 1;
                } else{
                    arr[0] = -1;
                }

                for(int i=1; i<n - 1; i++){
                    if(arr[i] == arr[i+1]) {
                        arr[i] = -1;
                    }else if(arr[i] == arr[i-1]){
                        arr[i] = -1;
                    }else minimumFrameCount += 1;
                }

                if(arr[n - 1] != arr[n-2] && n != 2) minimumFrameCount += 1;
                else if(n == 2 && arr[n - 2] != arr[n - 1]) minimumFrameCount += 1;
            }else{
                minimumFrameCount = 1;
            }

            System.out.println(minimumFrameCount);

            t -= 1;
        }
    }
}
