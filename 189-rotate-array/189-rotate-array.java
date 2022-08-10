class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //in case rotation is greater than length
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
    }
    static void swap(int[] nums,int left,int right)
    {
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}