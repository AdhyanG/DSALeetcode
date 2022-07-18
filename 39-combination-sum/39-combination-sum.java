class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int index=0;
        List<List<Integer>> result=new ArrayList<>();
        print_combinationSum(index,target,candidates,result,new ArrayList<>());
        return result;
        
    }
    static void print_combinationSum(int index,int target,int[] arr,List<List<Integer>> result,List<Integer> current)
    {
        if(index==arr.length){
            if(target==0){
                result.add(new ArrayList<>(current));
            }
           return ;
        }
        if(arr[index]<=target){
            current.add(arr[index]);
            print_combinationSum(index,target-arr[index],arr,result,current);
            current.remove(current.size()-1);
        }
           print_combinationSum(index+1,target,arr,result,current);
 
    }
    
    
}