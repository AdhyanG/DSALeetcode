class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int lh=height[start];
            int rh=height[end];
            int min=Math.min(lh,rh);
            max_area=Math.max(max_area,min*(end-start));
            if(lh<rh){
                start++;
            }
            else{
                end--;
            }
        }
        return max_area;
    }
}