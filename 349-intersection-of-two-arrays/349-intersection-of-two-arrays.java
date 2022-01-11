class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int j:nums2){
            if(set.contains(j)){
                set2.add(j);
            }
        }
        int[] ans=new int[set2.size()];
        int x=0;
        for(int k:set2){
            ans[x++]=k;
        }
        return ans;
    }
}