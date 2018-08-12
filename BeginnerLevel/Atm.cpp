#include<iostream>
#include<iomanip>

using namespace std;

int main(){
    int withDrawl;
    double totalAmount;
    cin>>withDrawl;
    cin>>totalAmount;

    if(withDrawl % 5 == 0 && withDrawl+0.5 <= totalAmount)
        cout<<fixed<<setprecision(2)<<totalAmount - ((withDrawl) + 0.50)<<endl;
    else
        cout<<fixed<<setprecision(2)<<totalAmount<<endl;

    return 0;
}