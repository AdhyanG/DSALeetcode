class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res=new int[nums.length];
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[t]=nums[i];
            t++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                res[t]=nums[i];
                t++;
            }
        }
        return res;
    }
}