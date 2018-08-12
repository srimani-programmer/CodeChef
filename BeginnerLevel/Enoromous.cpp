#include<iostream>

using namespace std;

int main(){
    int size,k;
    cin>>size>>k;
    int a[size];
    int count = 0;
    for(int i=0;i<size;i++){
        cin>>a[i];
    }

    for(int i=0;i<size;i++)
        if(a[i]%k == 0)
            count++;

    cout<<count<<endl;

    return 0;
}