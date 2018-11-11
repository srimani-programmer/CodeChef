#include<iostream>

using namespace std;

int main(){
    int size;
    cin>>size;
    int player1=0,player2=0,val;
    int p1=0,p2=0,maxDiff=0;

    for(int i=0;i<size;i++){
        cin>>val;
        player1 += val;
        cin>>val;
        player2 += val;

        if(player1 > player2)
            p1++;
        else
            p2++;

        if(abs(player1 - player2) > maxDiff)
            maxDiff = abs(player1 - player2);
      
    }
        if(p1>p2)
            cout<<1<<" ";
        else
            cout<<2<<" ";
        
        cout<<maxDiff<<endl;


    return 0;

}