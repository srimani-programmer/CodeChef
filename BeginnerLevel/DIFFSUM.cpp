#include<iostream>

using namespace std;

int main(){
    int val1,val2;
    cin>> val1 >> val2;
    if(val1 > val2)
        cout<<val1 - val2<<endl;
    else
        cout<<val1 + val2<<endl;

    return 0;
}