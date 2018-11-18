#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int size;
        cin>>size;
        vector<int>a;

        for(int i=0;i<size;i++){
            int val;
            cin>>val;
            a.push_back(val);
        }

        sort(a.begin(),a.end());

        int diff = a[1] - a[0];

        for(int i=2;i<size;i++){
            if(a[i]  - a[i-1] < diff)
                diff = a[i] - a[i-1];
        } 

        cout<<diff<<endl;
    }

    return 0;
}