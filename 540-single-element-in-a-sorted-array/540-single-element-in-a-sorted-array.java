class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int num:nums){
            res=res^num;
        }
        return res;
    }
}