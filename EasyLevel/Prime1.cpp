#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int lb,ub;
        cin>>lb>>ub;
        int count = 0;
        if(lb == 1)
            lb++;
        for(int i=lb;i<=ub;i++){
            count = 0;
            int k = sqrt(i)+1;
            for(int j=2;j<k;j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0)
                cout<<i<<endl;
        }
    }

    return 0;
}