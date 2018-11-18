#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){

    int t;
    cin>>t;

    while(t--){
        int size,k;
        cin>>size;
        vector<int>a;

        for(int i=0;i<size;i++){
            int val;
            cin>>val;
            a.push_back(val);
        }

        cin>>k;

        int song = a[k-1];

        sort(a.begin(),a.end());

        for(int i=0;i<a.size();i++){
            if(song == a[i]){
                song = i+1;
                break;
            }
        }

        cout<<song<<endl;
    }

    return 0;
}