class Solution {
    public int maxProduct(int[] nums) {
        int ans=0;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(n==2)
        {
            int res=(nums[n-2]-1)*(nums[n-1]-1);
            return res;
        }
        Arrays.sort(nums);
        ans=(nums[n-2]-1)*(nums[n-1]-1);
        return ans;
            
    }
}