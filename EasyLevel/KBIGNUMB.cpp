// this program is under progress

#include<iostream>
#include<string>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    while(testcases--){
        string a;
        int n,m;
        cin>>a>>n>>m;
        string newstr = " ";
        while(n--){
            newstr = newstr + a;
        }

        unsigned int val =  stoi(newstr);

        cout<<val%m<<endl;
    }

    return 0;
}