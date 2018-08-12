#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int value;
        cin>>value;

        cout<<(int)sqrt(value)<<endl;
    }

    return 0;
}