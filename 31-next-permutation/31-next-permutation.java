class Solution {
    public void nextPermutation(int[] nums) {
          if(nums==null || nums.length<=1) return;
        int a=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
        if(a==-1){
            reverse(nums,0,nums.length-1);
        }
        else{
            int b=0;
            for(int j=n-1;j>=0;j--){
                if(nums[j]>nums[a]){
                    b=j;
                        break;
                }
            }
            swap(nums,a,b);
            reverse(nums,a+1,n-1);
        }
        
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}