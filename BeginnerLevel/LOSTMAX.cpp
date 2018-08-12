//This code is under work
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    int size = testcases;

    for(int i=1;i<=testcases;i++){
        vector<int> vec;
        int val;
        for(int j=0;j<size;j++){
            cin>>val;
            vec.push_back(val);
        }
        sort(vec.begin(),vec.end());
        cout<<vec[vec.size()-1]<<endl;
        size = testcases + i;
    
    }

    return 0;
}