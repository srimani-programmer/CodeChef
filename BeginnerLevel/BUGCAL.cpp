#include<iostream>
#include<math.h>

using namespace std;

int main(){
    int testcases;
    cin>>testcases;

    while(testcases--){
        int val1,val2,curval1,curval2,currentsum = 0,finalsum = 0,index=0;
        cin>>val1>>val2;
        while(val1 > 0 || val2 > 0){
            curval1 = val1 % 10;
            curval2 = val2 % 10;
            currentsum = (curval1 + curval2)%10;
            finalsum = finalsum + pow(10,index) * currentsum;
            val1 = val1 /10;
            val2 = val2/10;
            index++;
        }
        cout<<finalsum<<endl;
    }

    return 0;
}