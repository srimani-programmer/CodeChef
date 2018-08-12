//This code is under progress...!

#include<iostream>
#include<vector>
#include<algorithm>
#include<iomanip>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int size;
        int removeItem;
        cin>>size>>removeItem;
        vector<int> vec;
        int val;
        for(int j=0;j<size;j++){
            cin>>val;
            vec.push_back(val);
        }
        sort(vec.begin(),vec.end());
        if(removeItem > 0){
            for(int j=0;j<removeItem;j++){
            vec.pop_back();
            vec.erase(vec.begin()+j);
        }
        }
        float sum = 0.0;
        for(int j=0;j<vec.size();j++){
            sum = sum + vec[j];
        }
        float avg = sum/vec.size() ;
        cout<<fixed<<setprecision(6)<<avg<<endl;

    }
    return 0;
}