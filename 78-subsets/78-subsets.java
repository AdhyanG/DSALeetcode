class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        int index=0;
        generate_subsets(index,n,new ArrayList<Integer>(),list,nums);
        return list;
    }
    static void generate_subsets(int index,int n,ArrayList<Integer> current, List<List<Integer>> list,int[] nums){
        if(index==n){
            
            list.add(new ArrayList<Integer>(current));
            return;
        }
        current.add(nums[index]);
        generate_subsets(index+1,n,current,list,nums);
      current.remove(current.size()-1);
        
         generate_subsets(index+1,n,current,list,nums);
    }
}