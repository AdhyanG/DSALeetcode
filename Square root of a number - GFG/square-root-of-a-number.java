// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		if(x==1){
		    return 1;
		}
		long s=0;
		long e=x/2;
		long ans=0;
		while(s<=e){
	
		    long mid=s+(e-s)/2;
		    long res=mid*mid;
		    if(res==x){
		        return mid;
		    }
		    else if(res>x){
		        e=mid-1;
		    }
		    else{
		        s=mid+1;
		        ans=mid;
		    }
		}
		return ans;
	 }
}
