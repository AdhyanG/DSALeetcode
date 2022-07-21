class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length/2;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int num:nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(int key:hmap.keySet()){
            if(hmap.get(key)>n){
                return key;
            }
        }
        return -1;
    }
}