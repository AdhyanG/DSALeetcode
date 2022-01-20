class Solution {
    public int search(int[] nums, int target) {
        int index=0;
      return linearSearch(nums,target,index);
    }
    public int linearSearch(int[] nums,int target,int index){
        if(index==nums.length)return -1;
        if(nums[index]==target)return index;
        return linearSearch(nums,target,index+1);
    }
}