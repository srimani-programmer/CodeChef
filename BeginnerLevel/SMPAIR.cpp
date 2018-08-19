#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    while(testcases--){
        int size,val;
        vector<int>vec;
        cin>>size;
        for(int i=0;i<size;i++){
            cin>>val;
            vec.push_back(val);
        }
        sort(vec.begin(),vec.end());

        cout<<vec[0] + vec[1]<<endl;
    }
    return 0;
}