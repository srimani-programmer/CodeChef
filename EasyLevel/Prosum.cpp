#include<iostream>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    while(testcases--){
        int size;
        cin>>size;
        int a[size];
        for(int j=0;j<size;j++)
            cin>>a[j];
        int count = 0;
        for(int j=0;j<size;j++){
            for(int k=1;k<size-1;k++){
                if(a[j]*a[k] > a[j]+a[k])
                    count++;
            }
        }

        cout<<count<<endl;

    }
    return 0;
}