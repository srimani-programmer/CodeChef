#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    for(int i=0;i<testcases;i++){
        int val;
        cin>>val;

        cout<<(val/2) + 1<<endl;
    }

    return 0;
}