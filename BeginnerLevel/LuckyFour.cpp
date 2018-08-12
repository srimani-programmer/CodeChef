#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        string s;
        int count = 0;
        cin>>s;
        for(int j=0;j<s.size();j++){
            if(s.at(j) == '4')
                count++;
        }

        cout<<count<<endl;
    }

    return 0;
}