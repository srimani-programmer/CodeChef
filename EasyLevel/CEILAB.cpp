#include<iostream>

using namespace std;

int main(){
    int a,b;
    cin>>a>>b;
    int diff;
    diff = a - b;
    if(diff % 10 < 9)
        diff = diff +1;
    else
        diff = diff - 1;
    cout<<diff;

    return 0;

}