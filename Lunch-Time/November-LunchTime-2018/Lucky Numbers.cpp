#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
bool isPrime(int n){
    if(n < 2)
        return false;

    for(int i=2;i<n;i++)
        if(n%i == 0)
            return false;
    return true;
}

int main(){
    int t;
    cin>>t;

    while(t--){
        int size;
        cin>>size;
       vector<int> a;
        for(int i=0;i,size;i++){
            int val;
            cin>>val;
            a.push_back(val);
        }

        int distinct=0,maxval=0;
        for(int i=0;i<size;i++){
            int res = isPrime(a[i]);
            int count1 = 0;
            for(int j=0;j<size;j++){
                if(res == 0)
                    break;
                else{
                    if(a[j] % a[i] == 0)
                        count1++;
                }
            }
            int rep = count(a.begin(),a.end(),a[i]);
            if((count1 > maxval) && (rep > 1)){
                maxval = count1;
                distinct = 1;
            }else if((count1 >= maxval)){

            }
            
        }
        
    }
}