#include <iostream>
#include <string>
using namespace std;
 
int main() {
	int t; 
    cin >> t;
	while (t--) {
		int n, k; 
        cin >> n >> k;
		string s; 
        cin >> s;
		int numLittle = 0, numCapital;
		for (int i = 0; i < s.size(); ++i)
			if (s[i] >= 'a' && s[i] <= 'z') ++numLittle;
		numCapital = s.size() - numLittle;
		if (numLittle > k && numCapital <= k) 
            cout << "chef" << endl;
		else if (numLittle <= k && numCapital > k) 
            cout << "brother" << endl;
		else if (numLittle <= k && numCapital <= k) 
            cout << "both" << endl;
		else 
            cout << "none" << endl;
	}
	
	return 0;
}