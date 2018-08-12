// Problem Code - FLOW018
 
#include<iostream>
 
using namespace std;
 
int main(){
    int testCase;
    cin>>testCase;
    for(int i=0;i<testCase;i++){
        int val;
        cin>>val;
        unsigned long long fact = 1;
            for(int j=1;j<=val;j++){
                fact = fact * j;
            }

            cout<<fact<<endl;
    }
    return 0;
} 