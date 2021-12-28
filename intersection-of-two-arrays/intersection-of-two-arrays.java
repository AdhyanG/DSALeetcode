class Solution {
   
    public int[] intersection(int[] nums1, int[] nums2) {
          Set<Integer> set1 = new HashSet<Integer>();    
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set1.add(nums1[i]);
                    //set1.add(nums2[j]);
                    
                }
            }
        }
            ArrayList<Integer> items = new ArrayList<Integer> ();
        for(int i: set1){
            items.add(i);
        }
 
        int[] name = items.stream().mapToInt(id -> id).toArray();
        return name; 
        
        
    }
}