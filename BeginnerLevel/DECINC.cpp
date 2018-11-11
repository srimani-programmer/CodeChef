#include<iostream>

using namespace std;

int main(){
    int val;
    cin>>val;

    if(val%4 == 0)
        cout<<val+1<<endl;
    else
        cout<<val-1<<endl;

    return 0;
}