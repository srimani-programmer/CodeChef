#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int amount;
        cin>>amount;
        int count = 0;
        if(amount >= 100){
            count = count + (amount/100);
        }if( amount%100 >= 50 || amount >= 50){
            count = count + (amount/50);
        }if(amount%50 >= 10 || amount >= 10){
            count = count + (amount/10);
        }if(amount%10 >= 5 || amount >= 5){
            count = count + (amount/5);
        }if(amount%5 >= 2 || amount >=2){
            count = count + (amount/2);
        }if(){
            count = count + (amount/2);
        }

        cout<<count<<endl;  
    }
    return 0;
}