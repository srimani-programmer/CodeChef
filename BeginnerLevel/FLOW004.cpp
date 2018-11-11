#include<iostream>
#include<string>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    while(testcases--){
        string s;
        cin>>s;
        int sum = 0;
        int size = s.size();

        int val = s[0] - '0';
        sum = sum + val;
        val = s[size-1] - '0';
        sum = sum+val;

        cout<<sum<<endl;
    }

    return 0;
}