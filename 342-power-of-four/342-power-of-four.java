class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        int s=0;
        int e=n;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(Math.pow(4,mid)==n)return true;
            else if(Math.pow(4,mid)<n)
            {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return false;
    }
}