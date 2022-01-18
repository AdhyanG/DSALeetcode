class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int l=flowerbed.length;
        int[] A=new int[l+2];
        for(int i=0;i<l;i++){
            A[i+1]=flowerbed[i];
        }
        for(int i=1;i<=l;i++){
            if(A[i]==0 && A[i-1]==0&&A[i+1]==0){
                count++;
                A[i]=1;
            }
        }
        return count>=n;
    }
}