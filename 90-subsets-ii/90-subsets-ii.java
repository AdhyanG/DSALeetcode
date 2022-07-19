class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        int index=0;
        print_subsetWithDup(index,nums,result,new ArrayList<>());
        List<List<Integer>> op=new ArrayList<>();
        for(List key:result){
            op.add(key);
        }
       
        
        return op;
    }
    static void print_subsetWithDup(int index,int[] nums,Set<List<Integer>> result,List<Integer> current)
    {
        if(index==nums.length){
            // if(!result.contains(new ArrayList<>(current)))
                result.add(new ArrayList<>(current));
            
         
            return;
            
        }
        current.add(nums[index]);
        print_subsetWithDup(index+1,nums,result,current);
        current.remove(current.size()-1);
          print_subsetWithDup(index+1,nums,result,current);
        
        
    } 
    
}