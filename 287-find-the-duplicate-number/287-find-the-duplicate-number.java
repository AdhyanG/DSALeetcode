class Solution {
    public int findDuplicate(int[] nums) {
        int hare=nums[0];
        int turtle=nums[0];
        do{
            hare=nums[nums[hare]];
            turtle=nums[turtle];
        }while(hare!=turtle);
            hare=nums[0];
   while(hare!=turtle){
       turtle=nums[turtle];
       hare=nums[hare];
   }
        return hare;
    }
}