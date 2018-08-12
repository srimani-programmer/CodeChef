#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    vector<int> vec;
    int testcases;
    cin>>testcases;
    while(testcases--){
        int val;
        int size,k;
        cin>>size;
        for(int i=0;i<size;i++){
            cin>>val;
            vec.push_back(val);
        }
        cin>>k;
        sort(vec.begin(),vec.end());

        for(int i=0;i<size;i++){
            if(vec[i] == k){
                cout<<i+1<<endl;
                break;
            }
                
        }
    }
    return 0;
}