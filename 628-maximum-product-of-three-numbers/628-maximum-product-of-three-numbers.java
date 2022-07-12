class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(nums.length==3){
            int res=nums[0]*nums[1]*nums[2];
            return res;
        }
        Arrays.sort(nums);
        int res1=Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
        return res1;
    }
}