#include<iostream>
#include<iomanip>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int quantity,price;
        double expenses;
        cin>>quantity>>price;
        if(quantity>1000)
        {
            expenses = quantity * price;
            cout<<fixed<<setprecision(6)<<expenses-(expenses*0.1)<<endl;
        }
        else{
            expenses = quantity*price;
            cout<<fixed<<setprecision(6)<<expenses<<endl;
        }         
    }

    return 0;
}