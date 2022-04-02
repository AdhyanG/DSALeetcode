// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution{
    public:
    int firstElementKTime(int a[], int n, int k)
    {
         unordered_map<int,int>hmap;
        for(int i=0;i<n;i++){
            hmap[a[i]] +=1;
            if(hmap[a[i]]==k){
                int count =a[i];
                return count;
            }
        }
        return -1;
    }
};

// { Driver Code Starts.

int main() {
	int t;
	cin >> t;
	while(t--){
	    int n, k;
	    cin >> n >> k;
	    int a[n];
	    for(int i = 0;i<n;i++){
	        cin >> a[i];
	    }
	    Solution ob;
	    cout<<ob.firstElementKTime(a, n, k)<<endl;
	}
	
	return 0;
}  // } Driver Code Ends