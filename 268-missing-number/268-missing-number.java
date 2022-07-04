class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<Integer>();
            for(int i:nums){
                set.add(i);
            }
        for(int j=0;j<=nums.length;j++){
            if(!set.contains(j)){
                return j;
            }
        }
        return -1;
    }
}