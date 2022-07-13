class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
          int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))return nums[i];
        
        else{
            map.put(nums[i],1);
        }
        }
        return -1;
    }
}