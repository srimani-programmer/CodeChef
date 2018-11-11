#include<iostream>

using namespace std;

int main(){
   
   int t;
   cin>>t;

   while(t--){
        int n;
        cin>>n;
        int *a = new int[n];

        for(int i=0;i<n;i++)
            cin>>a[i];

        unsigned int sum = 0;

        for(int i=0;i<n;i++)
            sum = sum + a[i];
        
        if(sum%2 == 1)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
   }

    return 0;
}