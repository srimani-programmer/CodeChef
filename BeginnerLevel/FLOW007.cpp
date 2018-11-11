#include<iostream>

using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int num;
        cin>>num;
        int rev=0;
        while(num != 0){
            int val = num % 10;
            rev = rev * 10 + val;
            num = num/10;
        }

        cout<<rev<<endl;
    }

    return 0;
}