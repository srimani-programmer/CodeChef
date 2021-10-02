#include <iostream>
#include <string>

using namespace std;

int main()
{
    long long int t;
    cin >> t;

    while (t--)
    {
        long long int N, A, B;
        cin >> N >> A >> B;
        string journey;
        cin >> journey;
        cout << journey << endl;
        long long int totalTime = 0;

        for (long long int i = 0; i < N; i++)
        {
            if (journey[i] == '0')
                totalTime += A;
            else if (journey[i] == '1')
                totalTime += B;
        }

        cout << totalTime << endl;
    }

    return 0;
}