#include<iostream>
#include<vector>

using namespace std;

vector<int> fib(int n){
    vector<int>fibResult;
    fibResult.push_back(0);
    fibResult.push_back(1);

    for(int i=2;i<n;i++){
        fibResult.push_back(fibResult[i-1] + fibResult[i-2]);
    }

    return fibResult;
}

void newFibValue(vector<int> arr){
    vector<int> newArray;

    for(int i=0;i<arr.size();i++){
        if((i+1)%2 == 0){
            newArray.push_back(arr[i]%10);
        }
    }

    if(newArray.size() == 1)
        cout<<newArray[0]<<endl;
    else{
        arr.clear();
        arr = newArray;
        newFibValue(arr);
    }

}
int main(){
    int t;
    cin>>t;

    while(t)
    {
        int n;
        cin>>n;
        vector<int> fibResult = fib(n);
        newFibValue(fibResult);
        //cout<<result<<endl;
        t = t - 1;
    }
    
    return 0;
}