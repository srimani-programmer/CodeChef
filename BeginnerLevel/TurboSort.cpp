//TSORT
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    vector <int> val;
    int size;
    int val1;
    cin>>size;
    for(int i=0;i<size;i++){
        cin>>val1;
        val.push_back(val1);
    }
    sort(val.begin(),val.end());

    for(int i=0;i<size;i++)
        cout<<val[i]<<endl;
    return 0;
}

