#include<iostream>
#include<math.h>
#include<iomanip>

using namespace std;

int main(){
    int a,b,c;
    cin>>a>>b>>c;
    double x1,x2,d;
    d = (b*b) - (4*a*c);
    x1 = (-b + sqrt(d))/(2*a);
    x2 = (-b - sqrt(d))/(2*a);

    cout<<fixed<<setprecision(6)<<x1<<endl<<x2<<endl;

    return 0;
}