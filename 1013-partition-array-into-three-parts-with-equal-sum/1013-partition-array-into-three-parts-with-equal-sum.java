class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           sum+=arr[i];
       }
        if(sum%3!=0)return false;
        int partSum=sum/3;
        int noPartition=0;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp+=arr[i];
            if(temp==partSum)
            {
                noPartition++;
                temp=0;
            }
             if(noPartition==3)return true;
        }
       
        return false;
    }
}