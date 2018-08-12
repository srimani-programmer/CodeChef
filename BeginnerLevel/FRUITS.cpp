#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    for(int i=0;i<testcases;i++){
        int apples,oranges,goldchains;
        cin>>apples>>oranges>>goldchains;

        if(apples - oranges == 0)
            cout<<0<<endl;
        else{
            int diff = abs(apples - oranges);
            if(goldchains>=diff)
                cout<<0<<endl;
            else
                cout<<diff - goldchains<<endl;
        }
    }

    return 0;
}