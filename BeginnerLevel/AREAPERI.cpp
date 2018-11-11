#include<iostream>

using namespace std;

int main(){
    int l,b;
    cin>>l>>b;
    int area,perimeter;
     area = l*b;
     perimeter = 2 * (l+b);

     if(area > perimeter)
        cout<<"Area\n"<<area;
    else if(perimeter == area)
        cout<<"Eq\n"<<area;
    else
        cout<<"Peri\n"<<perimeter;

    return 0;
}