#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    for(int i=0;i<testcases;i++){

        int a = 0,b = 0;
        cin >> a >> b;
        cout << a % b<<endl;
    }

    return 0;
}