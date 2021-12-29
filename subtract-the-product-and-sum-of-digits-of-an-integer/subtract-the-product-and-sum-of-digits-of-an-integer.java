class Solution {
    public int subtractProductAndSum(int n) {
        int sum=1;
        int pr=0;
        while(n>0){
            sum=sum*(n%10);
            pr=pr+(n%10);
            n=n/10;
        }
       
        //while(n>0){
            //pr=pr+(n%10);
          //  n=n/10;
        //}
      
    
        return sum-pr; 
    }
}