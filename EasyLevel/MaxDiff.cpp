#include<iostream>
#include<stdio.h>
#include<vector>
#include<algorithm>
using namespace std;

int main()
{
	int t;
	cin>>t;

	while(t--)
	{
		int n,k;

		scanf("%d %d",&n,&k);

		int a[n];

		for(int i = 0; i < n; i++)
		{
			scanf("%d",&a[i]);
		}

		sort(a,a+n);

		long long sum1,sum2;
		sum1 = 0;
		sum2 = 0;

		for(int i = 0; i < k; i++)
		{
			sum1+=a[i];
		}

		for(int i = k; i < n; i++)
		{
			sum2+=a[i];
		}

		long int a1 = sum2 - sum1;

		sum1=0;
		sum2=0;

		for(int i = 0; i < n-k; i++)
		{
			sum1+=a[i];
		}

		for(int i = n-k; i < n; i++)
		{
			sum2+=a[i];
		}
		long int b1 = sum2 - sum1;

		cout<<max(a1,b1)<<endl;
	}

return 0;
}
