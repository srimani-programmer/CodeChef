#include <iostream>

using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int A, B, C, D, E;
        cin >> A >> B >> C >> D >> E;

        if ((A + B <= D && C <= E) || (A + C <= D && B <= E) || (B + C <= D && A <= E))
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

    return 0;
}