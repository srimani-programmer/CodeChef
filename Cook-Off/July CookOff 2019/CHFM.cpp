#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    vector<int> v;
    int t;
    cin>>t;

    while (t--){

        int size;
        cin>>size;
        unsigned long int sum = 0;
        for(int i=0;i<size;i++){
            int val;
            cin>>val;
            sum += val;
            v.push_back(val);
        }

        float totalMean = (float)(sum)/size;

       // sort(v.begin(),v.end());

        int result = 0;
        int index = 0;
        while (true){
            
            
            unsigned long int tempSum = 0;
            for(int i=0;i<size;i++){
                if(i == index)
                    continue;
                else
                {
                    tempSum += v[i];
                }
                
            }

            float tempMean = tempSum/(float)(size-1);
            
        
            if(tempMean == totalMean){
                result = v[index];
                break;
            }else if(result == v[index]){
                result = 1;
                break;
            }

            if(index == size)
                break;

            index += 1;
        }
        
        if(result == 0)
            cout<<"Impossible"<<endl;
        else if(result == v[0])
            cout<<"1"<<endl;
        else
        {
            cout<<result<<endl;
        }
        
        v.clear();
        result = 0;
        index = 0;

        
    }

    return 0;
    
}