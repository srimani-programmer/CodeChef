#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    while(testcases--){
      unsigned int a,b,t;
        cin>>a>>b>>t;
        for(int i=1;i<=t;i++){
            if(i%2!=0)
                a = a*2;
            else
                b = b*2;
        }
      unsigned int max,min;
    if(a > b){
        max = a;
        min = b;
    }else{
        max = b;
        min = a;
    }
    int res = max/min;
        cout<<res<<endl;
    }

    return 0;
}