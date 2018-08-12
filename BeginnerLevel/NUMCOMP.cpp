#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    while(testcases--){
     long long a,b,n;
      cin>>a>>b>>n;
      
      if(pow(a,n) > pow(b,n))
        cout<<1<<endl;
      else if(pow(a,n) < pow(b,n))
        cout<<2<<endl;
      else if(pow(a,n) == pow(b,n))
        cout<<0<<endl;
    }
    return 0;
}