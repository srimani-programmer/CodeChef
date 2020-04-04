#include<iostream>
#include<bitset>
#include<algorithm>

using namespace std;

int getCount(unsigned int n){
    int result = 0;

    while(n > 0){
        if(n%2 == 1){
            result += 1;
        }
        n = n/2;
    }

    return result;
}

int main(){
    int t;
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL);
    cin>>t;

    while (t--) {
        int N,Q;
        cin>>N>>Q;
        int questions[N];

        for(int i=0; i<N; i++){
            cin>>questions[i];
        }

        for(int i=0;i<Q;i++){
            int P;
            cin>>P;
            unsigned int evenCount=0;
            unsigned int oddCount = 0;

            for(int i=0;i<N;i++){
                unsigned int result = getCount(P ^ questions[i]);
                if(result%2 == 0)
                    evenCount += 1;
                else
                    oddCount += 1;
            }

            cout<<evenCount<<" "<<oddCount<<endl;

        }

    }
    
    return 0;
}