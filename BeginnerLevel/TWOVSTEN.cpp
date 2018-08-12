#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    while(testcases--){
        int val;
        cin>>val;
        int count = 0;
        if(val%10 == 0)
            cout<<0<<endl;
        else if(val*2 % 10 == 0)
            cout<<1<<endl;
        else{
            cout<<-1<<endl;
        }
    }

    return 0;
}