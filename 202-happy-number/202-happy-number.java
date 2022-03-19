class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast= n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        else{
            return false;
        }
        
        
    
    }
    private int square(int number){
        int res=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            res +=rem*rem;
            number=number/10;
        }
        return res;
    }
}