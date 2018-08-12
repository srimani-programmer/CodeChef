#include<iostream>

using namespace std;

int main(){

    int testcases;
    float hardness,carbonContent,tensileStrength;

    cin>>testcases;
    

    for(int i=0;i<testcases;i++){
    cin>>hardness>>carbonContent>>tensileStrength;
    if(hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600 )
        cout<<"10"<<endl;
    else if(hardness > 50 && carbonContent < 0.7)
        cout<<"9"<<endl;
    else if(carbonContent < 0.7 && tensileStrength > 5600)
        cout<<"8"<<endl;
    else if(hardness > 50 && tensileStrength > 5600)
        cout<<"7"<<endl;
    else if(hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600)
        cout<<"6"<<endl;
    else
        cout<<"5"<<endl;
    }
    
    return 0;
}