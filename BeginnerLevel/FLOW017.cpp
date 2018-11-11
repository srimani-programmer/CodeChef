// Code is in progress...!

#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int a,b,c;
        cin>>a>>b>>c;
        
        if((a>b && a<c)|| (a>c && a<b))
            cout<< a <<endl;
        else if((b>a && b<c) || (b>c && b<a))
            cout<<b<<endl;
        else
            cout<<c<<endl;
    }

    return 0;
}