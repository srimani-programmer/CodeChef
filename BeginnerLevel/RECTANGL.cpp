#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    for(int i=0;i<testcases;i++){
        int a,b,c,d;
        cin>>a>>b>>c>>d;
        if((a == b && c == d) || (a == c && b == d) || (a == d && b == c))
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    return 0;
}