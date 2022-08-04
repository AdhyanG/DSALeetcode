class Solution {
    public int trap(int[] height) {
        int sum=0;
        int[] lmx=new int[height.length];
        int[] rmx=new int[height.length];
        lmx[0]=height[0];
        for(int i=1;i<lmx.length;i++){
            lmx[i]=Math.max(lmx[i-1],height[i]);
        }
        rmx[rmx.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rmx[i]=Math.max(rmx[i+1],height[i]);
        }
        int[] res=new int[height.length];
        for(int i=0;i<res.length;i++){
            res[i]=Math.min(lmx[i],rmx[i])-height[i];
        }
        for(int i=0;i<res.length;i++){
            sum=sum+res[i];
        }
        return sum;
        
    }
}