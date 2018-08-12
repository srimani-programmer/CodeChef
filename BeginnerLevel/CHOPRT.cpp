#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int val1,val2;
        cin>>val1>>val2;
        if(val1 > val2)
            cout<<">"<<endl;
        else if(val1 < val2)
            cout<<"<"<<endl;
        else
            cout<<"="<<endl;
    }

    return 0;
}