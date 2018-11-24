#include<iostream>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        string days[7] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        string start,end;
        int min,max;
        cin>>start>>end>>min>>max;
        int temp1,temp2;

        for(int i=0;i<7;i++){
            if(days[i] == start)
                temp1 = i+1;
            if(days[i] == end)
                temp2 = i+1;
        }

        if(temp1 > temp2){
            int diff = (7 - temp1) + temp2 + 1;
            int result =0,daycount=0,newresult=0;
            for(int i=min;i<=max;i=i+7){
                result = result + i;
                if(result < max){
                    daycount++;
                    newresult = newresult + i;
                }
                if(daycount > 2)
                    break;
            }

            if(daycount > 2)
                cout<<"many"<<endl;
            else if(diff < min)
                cout<<"impossible"<<endl;
            else
                cout<<newresult<<endl;

        }else{
            int diff = (temp2 - temp1) + 1;

            int result =0,daycount=0,newresult=0;
            for(int i=min;i<=max;i=i+7){
                result = result + i;
                if(result < max){
                    daycount++;
                    newresult = newresult + i;
                }
                    
                if(daycount > 2)
                    break;
            }

            if(daycount >= 2)
                cout<<"many"<<endl;
            else if(diff < min)
                cout<<"impossible"<<endl;
            else
                cout<<newresult<<endl;
        }

    }

    return 0;
}