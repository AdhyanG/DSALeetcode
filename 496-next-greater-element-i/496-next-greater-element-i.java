class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // use hashmap && stack
        HashMap<Integer,Integer> next_great=new HashMap();
        Stack<Integer> stack=new Stack();
        for(int num:nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                next_great.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=next_great.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}