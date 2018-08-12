// this code is under progress

#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int cats,dogs,legs;
        cin>>cats>>dogs>>legs;

        if((cats + dogs) * 4 == legs || (cats + dogs) * 2 == legs)
            cout<<"yes"<<endl;
        else
            cout<<"no"<<endl;
    }

    return 0;
}