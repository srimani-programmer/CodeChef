#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    while(testcases--){
        int size,extra;
        cin>>size>>extra;
        int a[size];
        for(int i=0;i<size;i++)
            cin>>a[i];

        for(int i=0;i<size;i++)
            a[i] = a[i] + extra;

        int mutationChange = 0;
        for(int i=0;i<size;i++){
            if(a[i]%7 == 0)
                mutationChange++;
        }

        cout<<mutationChange<<endl;
    }
    return 0;
}