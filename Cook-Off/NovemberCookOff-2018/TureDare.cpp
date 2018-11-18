#include<iostream>
#include<vector>

using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int tr_size,dr_size,ts_size,ds_size;
        vector<int>tr,dr,ts,ds;
        cin>>tr_size;

        for(int i=0;i<tr_size;i++){
            int val;
            cin>>val;
            tr.push_back(val);
        }
        cin>>dr_size;

        for(int i=0;i<dr_size;i++){
            int val;
            cin>>val;
            dr.push_back(val);
        }
        cin>>ts_size;

        for(int i=0;i<ts_size;i++){
            int val;
            cin>>val;
            ts.push_back(val);
        }

        cin>>ds_size;

        for(int i=0;i<ds_size;i++){
            int val;
            cin>>val;
            ds.push_back(val);
        }

        int truthcount=0,darecount=0;
    
        for(int i=0;i<ts_size;i++){
            for(int j=0;j<tr_size;j++){
                if(ts[i] == tr[j]){
                    truthcount++;
                    break;
                }
            }
        }

        for(int i=0;i<ds_size;i++){
            for(int j=0;j<dr_size;j++){
                if(ds[i] == dr[j]){
                    darecount++;
                    break;
                }
            }
        }

        if((truthcount == ts_size) && (darecount == ds_size))
            cout<<"yes"<<endl;
        else
            cout<<"no"<<endl;

        tr.clear();
        dr.clear();
        ts.clear();
        ds.clear();
    }

    return 0;
}