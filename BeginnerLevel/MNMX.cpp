//This code is under progress
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    for(int i=0;i<testcases;i++){
        vector<int> vec;
        int val;
        int size;
        cin>>size;
        for(int j=0;j<size;j++){
            cin>>val;
            vec.push_back(val);
        }
        sort(vec.begin(),vec.end());
        int count = 0;
        for(int k=0;k<size;k++){
            if(vec[k] == vec[vec.size()-1])
                count++;
        }
        for(int c=0;c<count;c++)
            vec.pop_back();

        cout<<vec[vec.size()-1]<<endl;
    }

    return 0;
}