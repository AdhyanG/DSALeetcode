class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        print_Sub(0,res,new ArrayList<Integer>(),nums,n);
        return res;
    }
    static void print_Sub(int index,List<List<Integer>> res,ArrayList<Integer> current,int[] nums,int n)
    {
        if(index==n)
        {
            res.add(new ArrayList<Integer>(current));
            return;
        }
        
        current.add(nums[index]);
        print_Sub(index+1,res,current,nums,n);
        current.remove(current.size()-1);
            print_Sub(index+1,res,current,nums,n);
    }
}