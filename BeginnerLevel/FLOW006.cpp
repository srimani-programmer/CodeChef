#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    for(int i=0;i<testcases;i++){
        int val;
        cin>>val;
        int rev = 0;
        int sum = 0;
        while(val!=0){
            rev = val % 10;
            val = val / 10;
            sum = sum + rev;

        }
        cout<<sum<<endl;
    }

}