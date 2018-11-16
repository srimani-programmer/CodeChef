#include<iostream>

using namespace std;
bool isPrime(int n){
    if(n < 2)
        return false;
    
    for(int  i=2;i<n;i++)
        if(n%i == 0)
            return false;

    return true;
}
int main(){
    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;
        int res = isPrime(n);

        if(res == 1)
            cout<<"yes"<<endl;
        else
            cout<<"no"<<endl;
    }

    return 0;
}